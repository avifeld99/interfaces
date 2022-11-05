package be.intecbrussel;

public class KeySwitch implements Switch {

    @Override
    public void turnOn() {
        System.out.println("klik klik ,keysON");
    }

    @Override
    public void turnOff() {
        System.out.println("klik klik ,keysOFF");
    }
}
