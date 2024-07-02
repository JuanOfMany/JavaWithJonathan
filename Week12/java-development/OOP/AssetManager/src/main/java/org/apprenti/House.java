package org.apprenti;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired,
            double originalCost, String address, int condition,
            int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        setAddress(address);
        setCondition(condition);
        setSquareFoot(squareFoot);
        setLotSize(lotSize);
    }

    @Override
    public double getValue(){
        int squareFoot = this.getSquareFoot();
        double perSquareFoot = 0;
        switch (getCondition()){
            case 1:
                perSquareFoot = 180.00d;
            case 2:
                perSquareFoot = 130.00d;
            case 3:
                perSquareFoot = 90.00d;
            case 4:
                perSquareFoot = 80.00d;
        }
        double lotSizeAdjustment = this.getLotSize() * 0.25d;

        return (perSquareFoot * this.getSquareFoot()) + lotSizeAdjustment;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
