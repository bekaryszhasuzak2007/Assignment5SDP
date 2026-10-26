public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Route calculated by car.");
    }
}