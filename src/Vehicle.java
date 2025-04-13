public class Vehicle {
    private final String model;
    private final int manufactureYear;
    private final int registerYear;
    private final int numOfSeats;
    private final double rentalRate;
    private final double extraKmRate;
    private boolean available;

    public Vehicle(String model, int manufactureYear, int registerYear, int numOfSeats, double rentalRate, double extraKmRate) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.registerYear = registerYear;
        this.numOfSeats = numOfSeats;
        this.rentalRate = rentalRate;
        this.extraKmRate = extraKmRate;
        this.available = true; // default available
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getRegisterYear() {
        return registerYear;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public double getExtraKmRate() {
        return extraKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Model: " + model +
                ", Year: " + manufactureYear +
                ", Registered: " + registerYear +
                ", Seats: " + numOfSeats +
                ", Rate: Rs." + rentalRate +
                ", Extra KM: Rs." + extraKmRate +
                ", Available: " + (available ? "Yes" : "No");
    }
}
