package oefening;

public class Step implements Wheels, Age {

    @Override
    public void sizeOfWheels(double size) {
        System.out.println("wheels of step are: " + size + " cm");
    }

    @Override
    public void forAge(int age) {
        System.out.println("let's find a step that suits your age --> " + age);
    }
}
