import io.github.joxebus.abstracts.AbstractAnimal;

public class Cat extends AbstractAnimal implements Meowable {

    static final String CAT_NAME = "Cat";

    public void makeSound() {
        meow();
    }

    public void meow() {
        System.out.println("Meow");
    }

    public void sayName() {
        System.out.println(CAT_NAME);
    }

}
