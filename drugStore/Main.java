package ООП.Lesson_1.drugStore;

import ООП.Lesson_1.Doctor;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("Medicine 1");
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);

        pharmacy1.addComponent(comp1).addComponent(comp2);

//        Интерфейс Serializable - отвечает за сериализацию объектов. Превращает объект в массив байтов, который потом
//        можно собрать обратно при помощи десериализатора.

        List<Marker> markers = new ArrayList<>();
        Doctor doc1 = new Doctor();
//        markers.add().add();

//        while (((Iterator<Component>) pharmacy1).hasNext()){
//            System.out.println(pharmacy1.next());
//        }
        System.out.println(pharmacy1);

//        DogPharmacy dogPharmacy = new DogPharmacy();
//        System.out.println(dogPharmacy.hashCode());
        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy("Medicine 2");
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy("Medicine 3");
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        Pharmacy pharmacy4 = new Pharmacy("Medicine 2");
        pharmacy4.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy5 = new Pharmacy("Medicine 3");
        pharmacy5.addComponent(comp5).addComponent(comp6);

        Pharmacy pharmacy6 = new Pharmacy("Medicine 4");
        Component comp7 = new Component("Aspirin", "10 mg", 3);
        Component comp8 = new Component("Nimesulid", "100 g", 13);
        pharmacy6.addComponent(comp7).addComponent(comp8);

        Pharmacy pharmacy7 = new Pharmacy("Medicine 5");
        Component comp9 = new Component("Ksilometazoline", "10 mg", 3);
        Component comp10 = new Component("Tramazoline", "100 g", 13);
        pharmacy7.addComponent(comp9).addComponent(comp10);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);
        nomenclature.add(pharmacy4);
        nomenclature.add(pharmacy5);
        nomenclature.add(pharmacy6);
        nomenclature.add(pharmacy7);

        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println("============================================================================");
        System.out.println(nomenclature);
        System.out.println("============================================================================");

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy3);
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy4);
        result.add(pharmacy5);
        result.add(pharmacy6);
        result.add(pharmacy7);
        System.out.println(result);
        System.out.println("В аптеке " + result.size() + " лекарств");

    }
}
