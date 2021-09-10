package circus.animal;

public class Duck extends Bird {

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
