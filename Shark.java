package ООП.Lesson_1;

public class Shark extends Animal{
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
}
