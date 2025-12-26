package hotelmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelImpl implements zHotel {
    List<Room> rooms;

    public HotelImpl() {
        this.rooms = new ArrayList<>();
    }

    /**
     * @param room
     */
    @Override
    public void addRoom(Room room) {

        rooms.add(room);

        System.out.println("Room " + room.getRoomNumber() + " added Successful");

    }

    /**
     * @param roomNumber
     * @param guestName
     * @return
     */
    @Override
    public boolean bookRoom(int roomNumber, String guestName) {
        return rooms.stream()
                .filter(room -> room.getRoomNumber() == roomNumber && !room.isBooked())
                .findFirst()
                .map(room -> {
                    room.bookRoom(guestName);
                    System.out.println(guestName + " guist Booked Room No. " + room.getRoomNumber());
                    return true;
                })
                .orElseGet(() -> {
                    System.out.println(roomNumber + " Room is not Empty! ");
                    return false;
                });
    }

    /**
     * @param roomNumber
     * @return
     */
    @Override
    public boolean checkoutRoom(int roomNumber) {
        return rooms.stream()
                .filter(room -> room.getRoomNumber() == roomNumber && room.isBooked())
                .findFirst()
                .map(room -> {
                    room.checkoutRoom(); // perform action
                    System.out.println(roomNumber + " Checkout successful");
                    return true; // indicate success
                })
                .orElseGet(() -> {
                    System.out.println("Room " + roomNumber + " is not booked!");
                    return false;
                });
    }

    /**
     * @return
     */
    @Override
    public List<Room> getAvailableRooms() {
        return rooms.stream()
                .filter(room -> !room.isBooked())
                .collect(Collectors.toList());
    }

    /**
     * @return
     */
    @Override
    public List<Room> getBookedRooms() {
        return rooms.stream()
                .filter(room -> room.isBooked())
                .collect(Collectors.toList());
    }


    /**
     * @param guestName
     * @return
     */
    @Override
    public String findGuest(String guestName) {
        return rooms.stream()
                .filter(room -> guestName.equals(room.getGuestName()))
                .findFirst()
                .map(room -> guestName + " guist Available in room " + room.getRoomNumber())
                .orElse(guestName + " not available in our Hotel");
    }
}