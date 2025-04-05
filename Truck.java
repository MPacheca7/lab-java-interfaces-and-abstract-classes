class Truck extends Car {
    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);

        this.towingCapacity  = towingCapacity;
    }

    @Override
    void additions() {
        System.out.println("- Truck: " + getInfo() + ", con capacidad de remolque: " + towingCapacity + " toneladas" + "\n==============");
    }
}
