package be.intecbrussel;

public class ElectroMotor implements Motor {

    @Override
    public void accelerate() {
        System.out.println("......no sound, speeding up");
    }

    @Override
    public void decelerate() {
        System.out.println("......no sound, slowing down");

    }
}
