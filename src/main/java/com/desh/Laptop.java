package com.desh;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("compileing LapTop");
    }
}
