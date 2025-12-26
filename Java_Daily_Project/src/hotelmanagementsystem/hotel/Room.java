package hotelmanagementsystem.hotel;

import java.time.LocalDateTime;
import java.util.List;

import hotelmanagementsystem.enums.PaymentStatus;
import hotelmanagementsystem.enums.roomtype;
import hotelmanagementsystem.user.User;

public class Room {
  private int roomNo;
  private roomtype type;
  private boolean isBooked;
  private double price;
  private int capacity;
  private LocalDateTime localDateTime;
    private List<User> bookedBy;
  private PaymentStatus paymentStatus;

  public Room() {
  }

    public Room(int roomNo, roomtype type, boolean isBooked, double price, int capacity, LocalDateTime localDateTime,
            List<User> bookedBy, PaymentStatus paymentStatus) {
        this.roomNo = roomNo;
        this.type = type;
        this.isBooked = isBooked;
        this.price = price;
        this.capacity = capacity;
        this.localDateTime = localDateTime;
        this.bookedBy = bookedBy;
        this.paymentStatus = paymentStatus;
    }


    @Override
    public String toString() {
    int bookedByCount = (bookedBy == null) ? 0 : bookedBy.size();
    return "Room [roomNo=" + roomNo + ", type=" + type + ", isBooked=" + isBooked + ", price=" + price + ", capacity="
        + capacity + ", localDateTime=" + localDateTime + ", bookedByCount=" + bookedByCount + ", paymentStatus="
        + paymentStatus + "]";
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public roomtype getType() {
        return type;
    }

    public void setType(roomtype type) {
        this.type = type;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public List<User> getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(List<User> bookedBy) {
        this.bookedBy = bookedBy;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

   
}