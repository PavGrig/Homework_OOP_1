package ООП.Lesson_1;

public class Dolphin extends Animal{

    public Dolphin(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
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
