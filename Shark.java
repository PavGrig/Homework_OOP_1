package ООП.Lesson_1;

public class Shark extends Animal implements Swimble{
    public Shark(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    @Override
    public void toFly() {
        System.out.println("Я не умею летать!!!");
    }
    @Override
    public void toRun() {
        System.out.println("Я не умею бегать!!!");
    }

    @Override
    public int GetSwimSpeed() {
        return 30;
    }
}
