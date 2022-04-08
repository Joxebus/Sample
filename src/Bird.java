public class Bird extends AbstractAnimal implements Flyable {

    final static String BIRD_NAME = "Paloma";

    public void makeSound() {
        sing();
    }

    public void sing() {
        System.out.println("Cucurrucucúu");
    }

    public void sayName() {
        System.out.println(BIRD_NAME);
    }
}
