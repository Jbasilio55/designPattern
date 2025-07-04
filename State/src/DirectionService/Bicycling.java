package DirectionService;

public class Bicycling implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirections() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
