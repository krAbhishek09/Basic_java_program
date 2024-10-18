public class Opps_s {

    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Setting properties
        myDog.name = "Kuttar";
        myDog.age = 5;

        // Calling methods
        myDog.walk();
        myDog.displayInfo();
    }
}

class Dog {

    String name;
    int age;

    // Method for the dog's walk behavior
    void walk() {
        System.out.println(name + " is walking...");
    }

    // Method to display the dog's information
    void displayInfo() {
        System.out.println("Dog's name: " + name);
        System.out.println("Dog's age: " + age);
    }
}
