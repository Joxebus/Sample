public class Bird extends Animal implements Flyable {

    final static String BIRD_NAME = "Paloma";

    public void makeSound() {
        sing();
    }

    public void sing() {
        System.out.println("CucurrucucĂșu");
    }

    public void sayName() {
        System.out.println(BIRD_NAME);
    }
}
