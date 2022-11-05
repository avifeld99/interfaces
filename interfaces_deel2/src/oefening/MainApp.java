package oefening;

public class MainApp {
    public static void main(String[] args) {

        Step step = new Step();
        ElectricStep eStep = new ElectricStep();

        step.forAge(8);
        eStep.forAge(15);

        step.sizeOfWheels(8.9);
        eStep.sizeOfWheels(8.9);

        eStep.turnOff();

        eStep.makeSound();

    }
}
