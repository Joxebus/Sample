import io.github.joxebus.abstracts.AbstractAnimal;

public class Dog extends AbstractAnimal implements Barkable {

    final static String DOG_NAME = "Dog";

    public void makeSound() {
        bark();
    }

    public void bark() {
        System.out.println("Woof woof");
    }

    public void sayName() {
        System.out.println(DOG_NAME);
    }

}
