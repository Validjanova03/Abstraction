public class Cat {
    void name(){
        System.out.println("Cat");
    }
    void sound(){
        System.out.println("Meow Meow");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name();
        cat.sound();
    }
}
