package com.stackroute.controller;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;
import com.stackroute.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class TrackController {

    private ResponseEntity<?> responseEntity;
    @Autowired
    private TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    public void setTrackService(TrackService trackService) {
        this.trackService = trackService;
    }


    //Reques Mapping for POST
    @GetMapping("track")
    @RequestMapping(value = "track", method = RequestMethod.POST)
    public ResponseEntity<?> saveTrack(@RequestBody Track track){

        try {
            Track track1 = trackService.saveTrack(track);
            responseEntity=  new ResponseEntity<Track>(track1, HttpStatus.OK);
        }
        catch (TrackAlreadyExistsException trackAlreadyExistsException){
            responseEntity = new ResponseEntity<>(trackAlreadyExistsException.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    //Request Mapping for GET
    @GetMapping("tracks")
    @RequestMapping(value = "tracks", method = RequestMethod.GET)
    public ResponseEntity<List<Track>> listOfUsers() {
        List<Track> allTracks = trackService.getAllTracks();
        return new ResponseEntity<List<Track>>(allTracks, HttpStatus.OK);
    }

    //Request Mapping for DELETE
    @GetMapping("delete/{id}")
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTrack(@PathVariable("id") int id){
        try {
            Track track2 = trackService.deleteTrack(id);
            responseEntity = new ResponseEntity<Track>(track2, HttpStatus.OK);
        }
        catch (TrackNotFoundException trackNotFoundException){
            responseEntity = new ResponseEntity<>(trackNotFoundException.getMessage(), HttpStatus.NOT_FOUND);

        }
        return responseEntity;
    }

    //Request Mapping for Update(PUT)
    @GetMapping("update/{id}")
    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateTrack(@PathVariable(value = "id") int trackId, @RequestBody Track track){
        try {
            Track track1 = (Track) trackService.updateByTrackId(trackId, track);
            return new ResponseEntity<Track>(track1, HttpStatus.OK);
        } catch (TrackNotFoundException trackNotFoundException) {
            return new ResponseEntity<>(trackNotFoundException.getMessage(), HttpStatus.CONFLICT);

        } catch (Exception exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
