package oefening2;

import oefening2.Motor;
import oefening2.Switch;

public interface Vehicle extends Switch, Motor {

    int doors = 5;

    void openDoor(int door);
    void closeDoor(int door);
}
