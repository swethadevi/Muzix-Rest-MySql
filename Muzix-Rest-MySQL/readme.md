## Muzix 

### Spring Boot  REST Api using the Java, Spring Boot, MySql DB, Maven and postman 

* Built Using
              * [Java] - The initial Language building block used
	      * [Spring-Boot] - The web framework used
	      * [MySQL] - The database framework used
              * [Maven] - Dependency Management 
              * [Postman] - To test the Api


### Problem Statement

 To develop Muzix Application and peform the basic CRUD Operations and store in the Sql Database


### Expected solution
Open the Postman and peroform the various CRUD Operation and check the MySql Database to check if the data is stored Consistently 

### Project structure

The folders and files you see in this repositories is as below, 

	.
└── Muzix-Rest-MySQL
    ├── muzix-rest.iml
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── stackroute
    │   │   │           ├── controller
    │   │   │           │   └── TrackController.java  // This class is used to perform the CRUD Operation
    │   │   │           ├── domain
    │   │   │           │   └── Track.java            // This is a skeleton code which has the Getters and Setters
    │   │   │           ├── exception
    │   │   │           │   ├── TrackAlreadyExistsException.java // This is an user defined exception which throws TrackAlreadyException
    │   │   │           │   └── TrackNotFoundException.java      // This  is an user defined exception which throws TrackNotFoundException
    │   │   │           ├── repository
    │   │   │           │   └── TrackRepository.java   //This is an Repository class which extends the CRUD Repository class for Queries    
    │   │   │           ├── service
    │   │   │           │   ├── TrackServiceImpl.java  //This is an Implementation class for the trackService Interface 
    │   │   │           │   └── TrackService.java      // This is an interface class for the Track class
    │   │   │           └── TrackMain.java             //  This is Main class file to run the Musix Album
    │   │   └── resources
    │   │       └── application.properties             //This file includes the information about the Sql database
    │   └── test
    │       └── java
    │           └── com
    │               └── stackroute
    │                   └── userrest
    │                       └── MuzixRestApplicationTests.java
    └── target
        ├── classes
        │   ├── application.properties
        │   ├── com
        │   │   └── stackroute
        │   │       ├── controller
        │   │       │   └── TrackController.class
        │   │       ├── domain
        │   │       │   └── Track.class
        │   │       ├── exception
        │   │       │   ├── TrackAlreadyExistsException.class
        │   │       │   └── TrackNotFoundException.class
        │   │       ├── repository
        │   │       │   └── TrackRepository.class
        │   │       ├── service
        │   │       │   ├── TrackService.class
        │   │       │   └── TrackServiceImpl.class
        │   │       └── TrackMain.class
        │   └── META-INF
        │       └── muzix-rest.kotlin_module
        ├── generated-sources
        │   └── annotations
        ├── generated-test-sources
        │   └── test-annotations
        └── test-classes
            └── com
                └── stackroute
                    └── userrest
                        └── MuzixRestApplicationTests.class
	
	



#### To use this project, you can follow these steps

1. Clone the folder ***Muzix-Rest-MySql*** to your  local machine
     
2. Navigate to Muzix-Rest-MySql folder

    `cd Muzix-Rest-MySql`

3. Open it to the IntelliJ Idea and wait for the dependencies to be downloaded

4. Change the MySql Database name,Username and password in the application properties file

5. Now execute the  ***TrackMain.java*** file 

6. Open the Postman and Perform the various CRUD Operations 



***Thats It***
