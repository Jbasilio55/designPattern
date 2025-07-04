package DirectionService;

public class Transit implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirections() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
