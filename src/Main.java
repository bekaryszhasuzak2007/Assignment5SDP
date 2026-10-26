
public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());

        navigator.buildRoute();

        navigator.setStrategy(new WalkStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new CycleStrategy());
        navigator.buildRoute();
    }
}
