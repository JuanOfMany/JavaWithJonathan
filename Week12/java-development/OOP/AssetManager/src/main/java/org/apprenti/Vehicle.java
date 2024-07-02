package org.apprenti;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        double value = this.getOriginalCost();
        int age = getYear();
        if (age < 4) {
            value = value - (value * 0.03 * age);
        } else if (age < 6) {
            value = value - (value * 0.06 * age);
        } else if (age < 11) {
            value = value - (value * 0.08 * age);
        } else {
            value = 1000.00;
        }

        if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
            value = value * 0.75;
        }

        return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
