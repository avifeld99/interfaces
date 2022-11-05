package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.turnOn();

        SmartPhone phone = new SmartPhone();
        phone.turnOff();
    }

}
