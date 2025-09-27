// Base class
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Lion subclass
class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    void roar() {
        System.out.println(name + " is roaring!");
    }
}

// Elephant subclass
class Elephant extends Animal {
    Elephant(String name, int age) {
        super(name, age);
    }

    void trumpet() {
        System.out.println(name + " is trumpeting!");
    }
}

// Monkey subclass
class Monkey extends Animal {
    Monkey(String name, int age) {
        super(name, age);
    }

    void climb() {
        System.out.println(name + " is climbing a tree!");
    }
}

// Class to test
public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 5);
        Elephant elephant = new Elephant("Ella", 8);
        Monkey monkey = new Monkey("Momo", 3);

        lion.display(); lion.roar();
        elephant.display(); elephant.trumpet();
        monkey.display(); monkey.climb();
    }
}