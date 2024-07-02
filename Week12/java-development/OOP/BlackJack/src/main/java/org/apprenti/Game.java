package org.apprenti;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players;

    public Game(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

    }
}
