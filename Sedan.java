class Sedan extends Car{
    private String seats;

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    void additions() {
        System.out.println("- Sedan: " + getInfo() + "\n==============");
    }
}
