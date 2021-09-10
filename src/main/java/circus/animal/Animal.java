package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {
    public String name;
    public abstract String speak();

    public static Comparator<Animal> animalComparator = new Comparator<Animal>(){
            public int compare(Animal left, Animal right) {
                return left.name.toLowerCase().compareTo(right.name.toLowerCase());
            }
    };
}
