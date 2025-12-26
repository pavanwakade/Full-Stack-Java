package hotelmanagementsystem.user;

import enums.IdType;
import hotel.Hotel;
import hotel.Room;

public class User {
    private Hotel bookedHotel;
    private Room bookedRoom;
    private String name;
    private int age;
    private IdType idtype;
    private long IdNo;

    public User() {
    }

    public User(Hotel bookedHotel, Room bookedRoom, String name, int age, IdType idtype, long idNo) {
        this.bookedHotel = bookedHotel;
        this.bookedRoom = bookedRoom;
        this.name = name;
        this.age = age;
        this.idtype = idtype;
        IdNo = idNo;
    }

    @Override
    public String toString() {
        return "User [bookedHotel=" + bookedHotel + ", bookedRoom=" + bookedRoom + ", name=" + name + ", age=" + age
                + ", idtype=" + idtype + ", IdNo=" + IdNo + "]";
    }

    public Hotel getBookedHotel() {
        return bookedHotel;
    }

    public void setBookedHotel(Hotel bookedHotel) {
        this.bookedHotel = bookedHotel;
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IdType getIdtype() {
        return idtype;
    }

    public void setIdtype(IdType idtype) {
        this.idtype = idtype;
    }

    public long getIdNo() {
        return IdNo;
    }

    public void setIdNo(long idNo) {
        IdNo = idNo;
    }

    

}