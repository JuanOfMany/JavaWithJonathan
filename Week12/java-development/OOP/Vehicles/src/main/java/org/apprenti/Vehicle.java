package org.apprenti;

public class Vehicle {
    private int numberOfSeats;
    private int speed;
    private int health;
    private String color;

    public Vehicle(int numberOfSeats, int speed, int health, String color ) {
        setNumberOfSeats(numberOfSeats);
        setSpeed(speed);
        setHealth(health);
        setColor(color);
    }

    public void accelerate(){
        setSpeed(getSpeed() + 1);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
