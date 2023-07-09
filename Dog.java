package ООП.Lesson_1;

public class Dog extends Animal implements Soundable, Swimble, Runable{

    public Dog(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }
//
//    @Override
//    public void toFly() {
//        System.out.println("Я не умею летать!!!");
//    }


    @Override
    public int GetSwimSpeed() {
        return 5;
    }

    @Override
    public int GetRunSpeed() {
        return 20;
    }

    @Override
    public void Sound() {
        System.out.println("Собаки говорят Гав!!!");
    }
}

