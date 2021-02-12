package fan;

public class Room {
    private int number;
    private double currentTemperature;
    private double targetTemperature;
    private double volume;
    private AirConditioner airConditioners;

    public Room(int number, double currentTemperature, double targetTemperature, double volume, AirConditioner airConditioners) {
        this.number = number;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.volume = volume;
        this.airConditioners = airConditioners;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public AirConditioner getAirConditioners() {
        return airConditioners;
    }

    public void setAirConditioners(AirConditioner airConditioners) {
        this.airConditioners = airConditioners;
    }

    public void cool(){
        if (currentTemperature > volume){
            airConditioners.lowerTemperature( currentTemperature, volume );
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                " number= " + number +
                " , currentTemperature= " + currentTemperature +
                " , targetTemperature= " + targetTemperature +
                " , volume= " + volume +
                " , airConditioners= "  + airConditioners +
                '}';
    }
}
