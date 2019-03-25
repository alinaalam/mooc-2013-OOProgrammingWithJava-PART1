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
    
    private List<Bird> birds;
    private Map<Bird, Integer> observations;
    
    Database() {
        birds = new ArrayList<Bird>();
        observations = new HashMap<Bird, Integer>();
    }
    
    public Bird searchBirds(String name) {
        for(Bird bird : birds) {
            if(bird.getName().equals(name) || bird.getLatinName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
    public void addBirds(String name, String latinName) {
        // add a bird only if it doesn't exist already
        if(searchBirds(name) == null && searchBirds(latinName) == null) {
            birds.add(new Bird(name, latinName));
        }
    }
    
    public void recordObservation(String observation) {
        Bird bird = searchBirds(observation);
        if(bird != null) {
            int counter = observations.getOrDefault(observation, 0);
            observations.put(bird, ++counter);
        }
        else {
            System.out.println("Is not a bird!");
        }
    }
    
    public void showStatistics() {
        for(Map.Entry<Bird, Integer> entry : observations.entrySet()) {
            Bird bird = entry.getKey();
            String stats = String.format("%s (%s): %d observations", 
                    bird.getName(), bird.getLatinName(), entry.getValue());
            System.out.println(stats);
        }
    }
}
