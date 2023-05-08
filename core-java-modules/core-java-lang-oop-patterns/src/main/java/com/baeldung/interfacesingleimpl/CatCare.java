package com.baeldung.interfacesingleimpl;

public class CatCare {
    private Cat cat;

    public CatCare(Cat cat) {
        this.cat = cat;
    }

    public String catSound() {
        return cat.makeSound();
    }
}