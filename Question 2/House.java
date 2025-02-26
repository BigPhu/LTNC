import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms;

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Room getRoom(int index) {
        if (index >= 0 && index < this.rooms.size()) {
            return this.rooms.get(index);
        } else {
            return null;
        }
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (Room room : this.rooms) {
            totalArea += room.getArea();
        }
        return totalArea;
    }
}
