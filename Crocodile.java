package ООП.Lesson_1;

public class Crocodile extends Animal implements Swimble, Runable{
    
    public Crocodile(String color, String species, Integer legsCount) {
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
        return 10;
    }

    @Override
    public int GetRunSpeed() {
        return 10;
    }


}
