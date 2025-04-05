class UtilityVehicle extends Car {
    private boolean fourWheelDrive;


    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);

        this.fourWheelDrive = fourWheelDrive;

    }

    @Override
    void additions() {
        System.out.println("- Utility Vehicleo: " + getInfo() + ", con tracción en cuatro ruedas: " + (fourWheelDrive ? "Sí" : "No") + "\n==============");
    }
}
