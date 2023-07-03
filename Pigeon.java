package ООП.Lesson_1;

public class Pigeon extends Animal {

    public Pigeon(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void toSwim() {
        System.out.println("Я не умею плавать!!!");
    }

}

