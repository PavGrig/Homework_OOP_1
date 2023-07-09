package ООП.Lesson_1;

import java.util.ArrayList;
import java.util.List;
import ООП.Lesson_1.Animal0;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Slon", 32, "true", "White",
        "Mammal", new Owner("Stas"), 4);
        Animal animal1 = new Animal("Black", "Bird", 2);
        System.out.println(animal.getAge());
        animal.setAge(3);
        System.out.println(animal.getAge());
        System.out.println(animal);
        Animal0 animal0 = new Animal0(null, null, null, null, null, null, null);
        animal0.getAge();
        System.out.println(animal0);
        Animal cat;
        cat = new Animal0();
        List <Animal> animals = new ArrayList<>();
        animals.add(new Dog(null, null, null));
        animals.add(new Cat(null, null, null));
        animals.add(cat);
        animals.add(animal);
        animals.add(animal1);
        System.out.println(animals);
        // for (Animal item : animals) {
        //     if (item instanceof Cat) {
        //     ((Cat)item).FIndFood(3);
        //     ((Cat)item).FIndFood();
        //     }
        // }
        Cat barsik = new Cat(null,null,null);
//        barsik.Hunt();
//        barsik.toFly();
        Dolphin flipper = new Dolphin(null, null, null);
//        flipper.toFly();
//        flipper.toRun();
//        flipper.toSwim();
        Pigeon pig = new Pigeon(null, null, null);
//        pig.toSwim();
//        pig.toFly();
        Crocodile croc = new Crocodile(null, null, null);
//        croc.toFly();
        VetClinic vetClinic = new VetClinic();
        vetClinic.addAnimal(barsik);
        vetClinic.addAnimal(flipper);
        vetClinic.addAnimal(pig);
        vetClinic.addAnimal(croc);

        System.out.println("Животные, которые умеют бегать:");
        for (Animal run: vetClinic.GetRunAnimals()) System.out.println(run.getClassName());

        System.out.println("Животные, которые умеют плавать:");
        for (Animal swim: vetClinic.GetSwimAnimals()) System.out.println(swim.getClassName());

        System.out.println("Животные, которые умеют летать:");
        for (Animal fly: vetClinic.GetFlyAnimals()) System.out.println(fly.getClassName());

    }
}
