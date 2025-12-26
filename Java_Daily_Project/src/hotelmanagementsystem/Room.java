public class Room {
    private final int roomNumber;
    private final String roomType;
    private final double pricePerNight;
    private boolean isBooked;
    private String guestName;

    // Constructor
    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isBooked = false; // Initially room is available
        this.guestName = null;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public String getGuestName() {
        return guestName;
    }

    public void bookRoom(String guestName) {
        this.isBooked = true;
        this.guestName = guestName;
    }

    public void checkoutRoom() {
        this.isBooked = false;
        this.guestName = null;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", isBooked=" + isBooked +
                ", guestName='" + guestName + '\'' +
                '}';
    }
}
