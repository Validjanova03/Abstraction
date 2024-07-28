public class Dog extends Animals {

    void name() {
        System.out.println("Dog");
    }

    void sound() {
        System.out.println("Bow bow");
    }
    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.name();
        dog.sound();
    }
}
