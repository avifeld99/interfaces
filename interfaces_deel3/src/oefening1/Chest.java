package oefening1;

public class Chest implements Lock {

    @Override
    public void lock() {
        System.out.println("chest is locked");
    }

    @Override
    public void unLock() {
        System.out.println("chest is unlocked");
    }
}
