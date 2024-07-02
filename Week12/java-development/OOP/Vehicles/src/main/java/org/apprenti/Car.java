package org.apprenti;

public abstract class Car extends Vehicle{

    private int horsePower;
    private int torque;
    private int wheelSize;
    private int gasTankSize;
    private boolean isAMiata;

    public Car(int numberOfSeats, int speed, int health, String color) {
        super(numberOfSeats, speed, health, color);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(int gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public boolean isAMiata() {
        return isAMiata;
    }

    public void setAMiata(boolean AMiata) {
        isAMiata = AMiata;
    }
}
