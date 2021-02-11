package fan;

public class BasicAirConditioner implements AirConditioners {
    private static final double COOL_TEMPERATUR = 1;
    @Override
    public double lowerTemperature(double temperature, double volume) {
        return temperature - (COOL_TEMPERATUR / volume);
    }

    @Override
    public String toString() {
        return "BasicAirConditioner{}";
    }
}
