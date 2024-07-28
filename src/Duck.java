public class Duck extends Animals{

    void name() {
        System.out.println("Duck");
    }


    void sound() {
        System.out.println("Quack Quack");
    }
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.name();
        duck.sound();
    }
}
