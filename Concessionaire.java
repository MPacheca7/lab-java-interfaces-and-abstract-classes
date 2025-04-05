public class Concessionaire {
    public static void main(String[] args) {
        Sedan Sedan = new Sedan("1HGCM82633A123456", "Toyota", "Corolla", 50000);
        UtilityVehicle UtilityVehicle = new UtilityVehicle("1J4FA241X7L123456", "Jeep", "Wrangler", 30000, true);
        Truck Truck = new Truck("1FTFW1E53MKE12345", "Ford", "F-150", 45000, 5.0);

        Sedan.additions();
        UtilityVehicle.additions();
        Truck.additions();
    }
}
