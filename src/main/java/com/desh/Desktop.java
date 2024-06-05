package com.desh;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("DeskTop creator");
    }

    @Override
    public void compile() {
        System.out.println("compiling in the Desktop");
    }

}
