import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingVehicles bookingSystem = new BookingVehicles("Colombo", "Kandy", "2025-04-13", "2025-04-15");

        // Register vehicles
        Vehicle v1 = new Vehicle("Toyota Axio", 2017, 2018, 5, 4500, 30);
        Vehicle v2 = new Vehicle("Honda Vezel", 2018, 2019, 5, 5000, 35);
        Vehicle v3 = new Vehicle("Suzuki Wagon R", 2016, 2017, 4, 3500, 25);
        bookingSystem.addVehicle(v1);
        bookingSystem.addVehicle(v2);
        bookingSystem.addVehicle(v3);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Admin Vehicle Management Menu ===");
            System.out.println("1. View All Vehicles");
            System.out.println("2. View Available Vehicles");
            System.out.println("3. Book a Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookingSystem.showAllVehicles();
                    break;

                case 2:
                    bookingSystem.showAvailableVehicles();
                    break;

                case 3:
                    bookingSystem.showAvailableVehicles();
                    System.out.print("Select vehicle number to book: ");
                    int vehicleIndex = Integer.parseInt(scanner.nextLine()) - 1;

                    if (vehicleIndex >= 0 && vehicleIndex < bookingSystem.getVehicleCount()) {
                        Vehicle selectedVehicle = bookingSystem.getVehicle(vehicleIndex);

                        if (!selectedVehicle.isAvailable()) {
                            System.out.println("Selected vehicle is not available.");
                            break;
                        }

                        System.out.print("Enter customer name: ");
                        String customerName = scanner.nextLine();

                        System.out.print("Enter contact number: ");
                        String contactNumber = scanner.nextLine();

                        System.out.print("Enter pick-up date (yyyy-mm-dd): ");
                        String pickUpDate = scanner.nextLine();

                        System.out.print("Enter drop-off date (yyyy-mm-dd): ");
                        String dropOffDate = scanner.nextLine();

                        bookingSystem.bookVehicle(selectedVehicle, customerName, contactNumber, pickUpDate, dropOffDate);
                    } else {
                        System.out.println("Invalid vehicle selection.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting admin menu...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }

        scanner.close();
    }
}
