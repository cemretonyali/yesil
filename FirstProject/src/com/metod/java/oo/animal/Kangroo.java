package com.metod.java.oo.animal;

public class Kangroo extends AbstractAnimal {

    public Kangroo() {
        super("MMMMM");
    }

    @Override
    public String move() {
        return "�ki ayak";
    }

    @Override
    public String eat() {
        return "Grass";
    }

}
