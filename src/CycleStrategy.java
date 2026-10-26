public class CycleStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Route calculated by bicycle.");
    }
}