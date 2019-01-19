package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;

import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track) throws TrackAlreadyExistsException; //for Posting data to DB

    public Track deleteTrack(int id) throws TrackNotFoundException; //to perform delete operation on the track

    public Track updateByTrackId(int trackId, Track track) throws TrackNotFoundException; // to operform the updation operation


    public List<Track> getAllTracks(); //for getting all data from DB



}
