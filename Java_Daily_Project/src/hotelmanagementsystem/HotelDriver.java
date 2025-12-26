package hotelmanagementsystem;

import hotelmanagementsystem.hotel.Hotel;

public class HotelDriver {
    public static void main(String[] args) {
        Hotel hotel = new HotelImpl();

        // Adding Rooms
//        hotel.addRoom(new Room(101, "Single", 1200));
//        hotel.addRoom(new Room(102, "Double", 2000));
//        hotel.addRoom(new Room(103, "Deluxe", 3500));

        for (int i = 1; i <= 30; i++) {
            if (i <= 10 && i <= 10) {
                hotel.addRoom(new Room(i, "Single", 1200));
            } else if (i >= 10 && i <= 20) {
                hotel.addRoom(new Room(i, "Double", 2000));
            } else {
                hotel.addRoom(new Room(i, "Deluxe", 3500));
            }
        }

        System.out.println();
//
        // Booking Rooms
        hotel.bookRoom(1, "Pavan");
        hotel.bookRoom(2, "Rahul");
//


        System.out.println();

//        // Checking Available Rooms
        System.out.println("\nAvailable Rooms:");
        for (Room room : hotel.getAvailableRooms()) {
            System.out.print(room.getRoomNumber() + " ");
        }


        System.out.println();
//
//        // Checking Booked Rooms
        System.out.println("\nBooked Rooms:");
        for (Room room : hotel.getBookedRooms()) {
            System.out.print(room.getRoomNumber() + " ");
        }
//
        System.out.println();

//        // Finding Guest
        System.out.println("\n" + hotel.findGuest("Pavan"));
        System.out.println(hotel.findGuest("Ramesh"));
//

        System.out.println();
        // Checkout
        hotel.checkoutRoom(1);
//

        System.out.println();
//        // Available Rooms After Checkout
        System.out.println("\nAvailable Rooms After Checkout:");
        for (Room room : hotel.getAvailableRooms()) {
            System.out.print(room.getRoomNumber() + " ");
        }
    }
}