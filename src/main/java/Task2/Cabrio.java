package Task2;

public class Cabrio {
    private String model;
    private String brand;
    private boolean roofIsOpen;
    private boolean carIsMove;

    public Cabrio(String model, String brand, boolean roofIsOpen, boolean carIsMove) {
        this.model = model;
        this.brand = brand;
        this.roofIsOpen = roofIsOpen;
        this.carIsMove = carIsMove;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRoofIsOpen() {

        return roofIsOpen;
    }

    public void setRoofIsOpen(boolean roofIsOpen) {
        if (isCarIsMove()) {
            System.out.println("Can't open roof, when car is driving");
        }
        else {
            this.roofIsOpen = roofIsOpen;
        }
    }

    public boolean isCarIsMove() {
        return carIsMove;
    }

    public void setCarIsMove(boolean carIsMove) {
        this.carIsMove = carIsMove;
    }
}
