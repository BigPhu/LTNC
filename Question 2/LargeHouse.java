import java.util.ArrayList;
import java.util.List;

public class LargeHouse extends Room {
    private List<Room> subRooms;

    public LargeHouse(String name, double area) {
        super(name, area);
        this.subRooms = new ArrayList<>();
    }

    public void addSubRoom(Room room) {
        this.subRooms.add(room);
    }

    public Room getSubRoom(int index) {
        if (index >= 0 && index < this.subRooms.size()) {
            return this.subRooms.get(index);
        } else {
            return null;
        }
    }

    public double getTotalArea() {
        double totalArea = this.getArea();
        for (Room subRoom : subRooms) {
            totalArea += subRoom.getArea();
        }
        return totalArea;
    }
}
