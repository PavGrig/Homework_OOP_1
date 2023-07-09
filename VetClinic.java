package ООП.Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {

    private List<Animal> animals;
    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }
    public List<Animal> GetRunAnimals() {
        List<Animal> runAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Runable) runAnimals.add((Animal) a);

        return runAnimals;
    }

    public List<Animal> GetSwimAnimals() {
        List<Animal> swimAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimble) swimAnimals.add((Animal) a);

        return swimAnimals;
    }

    public List<Animal> GetFlyAnimals() {
        List<Animal> flyAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyAnimals.add((Animal) a);

        return flyAnimals;
    }

    public List<Animal> GetSoundAnimals() {
        List<Animal> SoundAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Soundable) SoundAnimals.add((Animal) a);

        return SoundAnimals;
    }

}

