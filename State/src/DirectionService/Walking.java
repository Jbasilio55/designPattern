package DirectionService;

public class Walking implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirections() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
