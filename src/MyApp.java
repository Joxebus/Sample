import io.github.joxebus.abstracts.AbstractAnimal;
import io.github.joxebus.concrete.Bird;
import io.github.joxebus.concrete.Cat;
import io.github.joxebus.concrete.Dog;

/**
 * This comment is for document
 * this class
 */
public class MyApp {
    /**
     * This comment is at method level
     * @param args the input params
     */
    public static void main(String[] args) {
        // Tipo nombre y creacion del objeto

        AbstractAnimal animal = new Cat();
        animal.sayName();
        animal.makeSound();

        // Reasignando valor
        animal = new Dog();
        animal.sayName();
        animal.makeSound();

        animal = new Bird();
        animal.sayName();
        animal.makeSound();

        System.out.println(Dog.DOG_NAME);
        System.out.println(Cat.CAT_NAME);
        System.out.println(Bird.BIRD_NAME);
    }

}
