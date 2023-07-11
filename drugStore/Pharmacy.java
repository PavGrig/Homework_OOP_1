package ООП.Lesson_1.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.CharSequence.compare;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {

    private List<Component> components;
    private int componentsCount;

    private String id;

    public Pharmacy(String id) {
        this.components = new ArrayList<>();
        this.id = id;
        this.componentsCount = 0;
    }
    public Pharmacy addComponent (Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }
    private String getId(){
        return this.id;
    }
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "ID = " + getId() + ";" + " The composition of the medicine: {" +
                "components=" + components +
                ", index=" + componentsCount +
                '}'+"Total power = " + getPower(this)+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<Component>() { //Анонимный класс
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//        };
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        String comp1 = getName(this);
        String comp2 = getName(o);
//        return Integer.compare(pow1, pow2); Альтернативная запись:

        if (pow1 > pow2) return 1;
        else if (pow1 < pow2) return -1;
        else return compare(comp1, comp2);
    }
    private int getPower (Pharmacy pharm) {
        int result = 0;
        for (Component elem: pharm.getComponents()) {
            result += elem.getPower();
        }
        return result;
    }
    private String getName(Pharmacy pharm){
        String result = "";
        for (Component elem: pharm.getComponents()) {
            result += elem.getName();
        }
        return result;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pharmacy pharma = (Pharmacy) obj;
        return this.id.equals(pharma.getId());
    }

    @Override
    public int hashCode() {
        int result = id == null ? 0 : id.hashCode();
        return result;
    }
}
