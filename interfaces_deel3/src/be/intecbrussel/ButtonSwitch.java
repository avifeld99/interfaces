package be.intecbrussel;

public class ButtonSwitch implements Switch {

    @Override
    public void turnOn() {
        System.out.println("tik tik, button ON");
    }

    @Override
    public void turnOff() {
        System.out.println("tik tik, button OFF");
    }
}
