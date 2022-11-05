package be.intecbrussel;

public class Mower implements LawnMower {

    @Override
    public void adjustHeight(int heightGrass) {
        System.out.println("height is adjusted to: " + heightGrass + " mm");
    }

    @Override
    public void accelerate() {
        System.out.println("moving forward");
    }

    @Override
    public void decelerate() {
        System.out.println("slowing down");
    }

    @Override
    public void turnOn() {
        System.out.println("lawnmower is turned on, start cutting the grass");
    }

    @Override
    public void turnOff() {
        System.out.println("lawnmower is turned off, laat het gras maar groeien!");
    }

}
