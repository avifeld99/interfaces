package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Horn smallHorn = new SmallHorn();
        Horn bigHorn = new BigHorn();

        Switch keySwitch = new KeySwitch();
        Switch buttonSwitch = new ButtonSwitch();

        Motor petrolMotor = new PetrolMotor();
        Motor electroMotor = new ElectroMotor();

        Car oldCar = new Car(keySwitch, petrolMotor, smallHorn);
        Car electricCar = new Car(buttonSwitch, electroMotor, bigHorn);

        oldCar.getOnOffSwitch().turnOn();
        electricCar.getOnOffSwitch().turnOn();

        oldCar.getHorn().makeSound();

        Car car3 = new Car(new ButtonSwitch(), new PetrolMotor(), new BigHorn());
        car3.getHorn().makeSound();

    }
}
