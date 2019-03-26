/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alinaalam
 */
import java.util.*;

public class Database {
    
    private Map<String, Bird> birds;
    private Map<String, Integer> observations;
    
    Database() {
        birds = new HashMap<String, Bird>();
        observations = new HashMap<String, Integer>();
    }
    
    public Bird searchBirds(String name) {
        return (birds.containsKey(name)) ? birds.get(name) : null;
    }
    
    public void addBirds(String name, String latinName) {
        // add a bird only if it doesn't exist already
        if(searchBirds(name) == null && searchBirds(latinName) == null) {
            birds.put(name, new Bird(name, latinName));
        }
    }
    
    public void recordObservation(String observation) {
        Bird bird = searchBirds(observation);
        if(bird != null) {
            int counter = observations.getOrDefault(observation, 0);
            observations.put(bird.getName(), ++counter);
        }
        else {
            System.out.println("Is not a bird!");
        }
    }
    
    public void showStatistics() {
        for(Map.Entry<String, Bird> entry : birds.entrySet()) {
            Bird bird = entry.getValue();
            String stats = String.format("%s (%s): %d observations", 
                    bird.getName(), bird.getLatinName(), observations.getOrDefault(entry.getKey(), 0));
            System.out.println(stats);
        }
    }
    
    public void showBird(String name) {
        if(birds.containsKey(name)) {
            Bird bird = birds.get(name);
            String stats = String.format("%s (%s): %d observations", 
                    bird.getName(), bird.getLatinName(), observations.getOrDefault(name, 0));
            System.out.println(stats);
        }
    }
}
