package com.metod.java.oo.animal;

public class Cat extends AbstarctMeatEatingAnimal {

    public Cat() {
        super("miyav");
    }

    @Override
    public String move() {
        return "d�rt ayak y�r�";
    }

}
