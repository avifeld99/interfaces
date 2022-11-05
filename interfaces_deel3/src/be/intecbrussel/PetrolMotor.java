package be.intecbrussel;

public class PetrolMotor implements Motor {

    @Override
    public void accelerate() {
        System.out.println("rumbling sound, speeding up");
    }

    @Override
    public void decelerate() {
        System.out.println("less rumbling sound, slowing down");
    }
}
