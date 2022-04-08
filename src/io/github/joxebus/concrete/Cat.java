package io.github.joxebus.concrete;

import io.github.joxebus.abstracts.AbstractAnimal;
import io.github.joxebus.interfaces.Meowable;

public class Cat extends AbstractAnimal implements Meowable {

    public static final String CAT_NAME = "Cat";

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
