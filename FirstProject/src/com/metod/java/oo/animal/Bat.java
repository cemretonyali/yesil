package com.metod.java.oo.animal;

public class Bat extends AbstractAnimal {

    public Bat() {
        super("zzzzz");
    }

    @Override
    public String move() {
        return "d�rt ayak y�r�";
    }

    @Override
    public String eat() {
        return "insects";
    }

    @Override
    public String sleep() {
        return "not sleep";
    }

}
