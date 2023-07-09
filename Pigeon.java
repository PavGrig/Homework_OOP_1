package ООП.Lesson_1;

public class Pigeon extends Animal implements Soundable, Flyable, Runable {

    public Pigeon(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void toSwim() {
        System.out.println("Я не умею плавать!!!");
    }

    @Override
    public int GetRunSpeed() {
        return 2;
    }

    @Override
    public void Sound() {
        System.out.println("Голуби говорят Курлык!!!");
    }

    @Override
    public int GetFlySpeed() {
        return 10;
    }
}

