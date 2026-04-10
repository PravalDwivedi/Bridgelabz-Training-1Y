public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.getRouteHistory().addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 40, 60, 70));

        d.getRouteHistory().addCheckpoint(
                new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));

        d.getRouteHistory().addCheckpoint(
                new RestCheckpoint("C3", "Motel X", 10, 20, 45));

        d.getRouteHistory().addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 50, 60, 75));

        d.printSummary();
    }
}