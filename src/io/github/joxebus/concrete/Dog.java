package io.github.joxebus.concrete;

import io.github.joxebus.abstracts.AbstractAnimal;
import io.github.joxebus.interfaces.Barkable;

public class Dog extends AbstractAnimal implements Barkable {

    public final static String DOG_NAME = "Dog";

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
