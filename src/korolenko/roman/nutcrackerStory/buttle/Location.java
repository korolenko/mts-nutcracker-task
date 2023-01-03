package korolenko.roman.nutcrackerStory.buttle;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    List<Location> locationObjects;

    public Location(String name){
        this.name = name;
        locationObjects = new ArrayList<>();
    }

    public void addObject(String name){
        locationObjects.add(new Location(name));
    }

    public Location findLocationByName(String name){
        return locationObjects
                .stream()
                .filter(object -> object.name.equalsIgnoreCase(name))
                .findAny()
                .orElse(null);
    }
}
