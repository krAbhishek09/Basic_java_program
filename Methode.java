
public class Methode {

    public static void main(String[] args) {

        Greet obj = new Greet(); // Corrected the class name and constructor call
        // obj.Greeting();
        obj.Greeting("Random");
    }

}

class Greet { // Fixed the class declaration

    void Greeting() {
        System.out.println("hello Goodmorning");

    }

    void Greeting(String name) {
        System.out.println("hello Good" + name);

    }
}
