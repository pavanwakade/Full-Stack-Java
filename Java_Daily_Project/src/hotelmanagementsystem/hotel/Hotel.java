package hotelmanagementsystem.hotel;

import java.util.Map;

import hotelmanagementsystem.enums.roomtype;
import hotelmanagementsystem.enums.Location;

public class Hotel {


   private final String hotelName="Taj Hotel";

    private Location location;

    private int totalRooms;

    private Map<roomtype, Integer> roomAvailable;


    public Hotel() {}

    public Hotel( Location location, int totalRooms, Map<roomtype, Integer> roomAvailable) {
        // this.hotelName = hotelName;
        this.location = location;
        this.totalRooms = totalRooms;
        this.roomAvailable = roomAvailable;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public Map<roomtype, Integer> getRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(Map<roomtype, Integer> roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

   
    @Override
    public String toString() {
        return "Hotel [hotelName=" + hotelName + ", location=" + location + ", totalRooms=" + totalRooms + "]";
    }



}