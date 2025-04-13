import java.util.Date;

public class Booking {
    private Vehicle bookedVehicle;
    private String customerName;
    private String contactNumber;
    private String pickUpLocation;
    private String dropOffLocation;
    private Date pickUpDate;
    private Date dropOffDate;


    public Booking( Vehicle bookedVehicle, String customerName, String contactNumber, String pickUpLocation, String dropOffLocation, Date pickUpDate, Date dropOffDate  ){

        this.bookedVehicle=bookedVehicle;
        this.customerName=customerName;
        this.contactNumber=contactNumber;
        this.pickUpLocation=pickUpLocation;
        this.dropOffLocation=dropOffLocation;
        this.pickUpDate=pickUpDate;
        this.dropOffDate=dropOffDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Vehicle getBookedVehicle() {
        return bookedVehicle;
    }

}
