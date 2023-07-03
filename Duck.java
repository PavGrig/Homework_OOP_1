package ООП.Lesson_1;

public class Duck extends Animal{
    
    public Duck(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void toSwim() {
        System.out.println("Я не умею плавать!!!");
    }

}
