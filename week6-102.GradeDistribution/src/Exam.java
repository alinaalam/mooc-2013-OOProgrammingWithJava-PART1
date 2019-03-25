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

public class Exam {
    
    private int accepted;
    private int allScores;
    private List<Integer> scores;
    private Map<Integer, Integer> result;
    
    Exam() {
        scores = new ArrayList<Integer>();
        result = new HashMap<Integer, Integer>();
        generateResultSheet();
    }
    
    private void generateResultSheet() {
        for(int i=0; i<=5; i++) {
            result.put(i, 0);
        }
    }
    
    public void addScore(int score) {
        if(score >= 0) {
            scores.add(score);
            updateResultSheet(score);
        }
    }
    
    private void updateResultSheet(int score) {
        if(score >= 0 && score <= 29) {
            updateResultValue(0);
        }
        else if(score >= 30 && score <= 34) {
            updateResultValue(1);
        }
        else if(score >= 35 && score <= 39) {
            updateResultValue(2);
        }
        else if(score >= 40 && score <= 44) {
            updateResultValue(3);
        }
        else if(score >= 45 && score <= 49) {
            updateResultValue(4);
        }
        else if(score >= 50 && score <= 60) {
            updateResultValue(5);
        }
        
        if(score >= 0 && score <= 60) {
            allScores++;
            if(score >= 30) {
                accepted++;
            }
        }
    }
    
    private void updateResultValue(int key) {
        int counter = result.get(key);
        result.put(key, ++counter); 
    }
    
    public void printScores() {
        System.out.println("Grade distribution: ");
        for(int i=5; i>=0; i--) {
            System.out.print(i + ": ");
            printStars(result.get(i));
            System.out.println("");
        }
        if(allScores > 0) {
            System.out.println("Acceptance percentage: " + (100.0 * accepted)/allScores);
        }
        else {
            System.out.println("Acceptance percentage: " + 0.0);
        }
    }
    
    private void printStars(int count) {
        for(int i=1; i<=count; i++) {
            System.out.print("*");
        }
    }
}
