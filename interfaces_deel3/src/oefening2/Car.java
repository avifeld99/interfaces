package oefening2;

public class Car implements Vehicle {

    private boolean onOff = false;

    @Override
    public void gas() {
        if (onOff == true) {
            System.out.println("drive");
        } else {
            System.out.println("car is off");
        }
    }

    @Override
    public void toggleSwitch() {
        if (onOff == false) {
            onOff = true;
        } else {
            onOff = false;
        }
    }

    @Override
    public void openDoor(int door) {

    }

    @Override
    public void closeDoor(int door) {

    }
}
