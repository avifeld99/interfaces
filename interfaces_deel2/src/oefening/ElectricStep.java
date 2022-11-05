package oefening;

import be.intecbrussel.Horn;

public class ElectricStep implements Switch, Horn {

    @Override
    public void turnOn() {
        System.out.println("eStep engine is on");
    }

    @Override
    public void turnOff() {
        System.out.println("eStep engine is off");
    }

    @Override
    public void sizeOfWheels(double size) {
        System.out.println("wheels of electrical step are: " + size + " cm");
    }

    @Override
    public void forAge(int age) {
        if (age < 16) {
            System.out.println("too young for electrical step");
        } else {
            System.out.println("you're " + age + " ,enjoy your new electrical step but always be careful");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("ring ring");
    }
}
