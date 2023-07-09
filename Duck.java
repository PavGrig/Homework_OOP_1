package ООП.Lesson_1;

public class Duck extends Animal implements Soundable, Flyable, Runable, Swimble{
    
    public Duck(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

//    @Override
//    public void toSwim() {
//        System.out.println("Я не умею плавать!!!");
//    }

    @Override
    public int GetSwimSpeed() {
        return 5;
    }

    @Override
    public int GetRunSpeed() {
        return 5;
    }

    @Override
    public void Sound() {
        System.out.println("Утки говорят Кря!!!");
    }

    @Override
    public int GetFlySpeed() {
        return 10;
    }
}

