package be.intecbrussel;

public class SmartPhone implements Switch {

    @Override
    public void turnOn() {
        System.out.println("smartphone is on");
    }

    @Override
    public void turnOff() {
        System.out.println("smartphone is off");
    }

}
