class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Single inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

//multilevel inheritance
class Tiger extends Dog {
    void color(){
        System.out.println("The Tiger is yellow");
    }
}

// Hierarchical inheritance
class Cat extends Animal {
    void name() {
        System.out.println("The cat name is Tomi");
    }
}

public class InheritanceInJava {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.bark(); 

        Cat cat = new Cat();
        cat.eat(); 
        cat.name(); 

        Tiger tiger = new Tiger();
        tiger.bark();
        tiger.color();
    }
}
