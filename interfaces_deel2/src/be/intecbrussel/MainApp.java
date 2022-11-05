package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Car car = new Car();
        car.makeSound();
        car.turnOn();
        car.accelerate();

        Mower mower = new Mower();
        mower.adjustHeight(4);
        mower.accelerate();

    }
}
