package io.github.joxebus.concrete;

import io.github.joxebus.abstracts.AbstractAnimal;
import io.github.joxebus.interfaces.Flyable;

public class Bird extends AbstractAnimal implements Flyable {

    public final static String BIRD_NAME = "Paloma";

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
