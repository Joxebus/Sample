public class Dog extends Animal implements Barkable {

    static final String DOG_NAME = "Dog";

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
