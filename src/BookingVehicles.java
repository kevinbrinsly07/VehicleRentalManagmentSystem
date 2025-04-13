import java.util.ArrayList;
import java.util.List;

public class BookingVehicles {
    private String pickUpLocation;
    private String dropOffLocation;
    private String pickUpDate;
    private String dropOffDate;

    private List<Vehicle> vehicles = new ArrayList<>();

    public BookingVehicles(String pickUpLocation, String dropOffLocation, String pickUpDate, String dropOffDate) {
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showAllVehicles() {
        System.out.println("\nAll Vehicles:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". " + vehicles.get(i));
        }
    }

    public void showAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        int count = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).isAvailable()) {
                System.out.println((i + 1) + ". " + vehicles.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No vehicles available.");
        }
    }

    public void bookVehicle(Vehicle vehicle, String customerName, String contactNumber, String pickUpDate, String dropOffDate) {
        if (vehicle.isAvailable()) {
            vehicle.setAvailable(false); // mark it unavailable
            Booking booking = new Booking(vehicle, customerName, contactNumber, pickUpLocation, dropOffLocation, new java.util.Date(), new java.util.Date());
            System.out.println("Booking confirmed for " + customerName + " - " + vehicle.getModel());
        } else {
            System.out.println("Vehicle is not available.");
        }
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public Vehicle getVehicle(int index) {
        return vehicles.get(index);
    }
}
