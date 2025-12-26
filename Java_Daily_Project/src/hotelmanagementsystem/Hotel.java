import java.util.List;

public interface Hotel {

    String HotelName = "";
    String Location = "";

    // Add a new room to the hotel
    void addRoom(Room room);

    // Book a room for a guest
    boolean bookRoom(int roomNumber, String guestName);

    // Check-out a guest from a room
    boolean checkoutRoom(int roomNumber);

    // Display available rooms
    List<Room> getAvailableRooms();

    // Display all booked rooms
    List<Room> getBookedRooms();

    // Search guest by name
    String findGuest(String guestName);
}
