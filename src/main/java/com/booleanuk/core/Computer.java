package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply powerSupply;
    private Game game;

    public Computer(PowerSupply powerSupply) {
        this.installedGames = new ArrayList<>();
        this.game = new Game("Pokemon");
        this.powerSupply = powerSupply;
    }
    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames) {
        this.installedGames.addAll(installedGames);
        this.powerSupply = powerSupply;
    }

    public Computer(PowerSupply powerSupply, Game game, ArrayList<Game> installedGames) {
        this.game = game;
        this.installedGames = installedGames;
        this.powerSupply = powerSupply;
    }


    public void turnOn() {
        this.powerSupply.turnOn();
    }

    public void installGame(String theGame) {
        Game game = new Game(theGame);
        this.installedGames.add(game);
    }

    public String playGame(String theGame) {
        for(Game game : this.installedGames) {
            if (game.name.equals(theGame)) {
                return game.start();
            }
        }
        return "Game not installed";
    }

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void setInstalledGames(ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
