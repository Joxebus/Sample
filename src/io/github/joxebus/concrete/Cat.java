package io.github.joxebus.concrete;

import io.github.joxebus.abstracts.AbstractAnimal;
import io.github.joxebus.interfaces.Meowable;

public class Cat extends AbstractAnimal implements Meowable {

    static final String CAT_NAME = "io.github.joxebus.concrete.Cat";

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
