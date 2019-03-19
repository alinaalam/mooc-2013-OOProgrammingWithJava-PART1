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

public class Team {
    
    private String name;
    private List<Player> players;
    private int size;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        size = 16;
    }

    public String getName() {
        return name;
    }
    
    public void setMaxSize(int maxSize) {
        size = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public void addPlayer(Player player) {
        if(players.size() < size) {
            players.add(player);
        }
    }
    
    public void printPlayers() {
        for(Player player : players) {
            System.out.println(player);
        }
    }
    
    public int goals() {
        int goals = 0;
        
        for(Player player : players) {
            goals += player.goals();
        }
        
        return goals;
    }
}
