package com.desh;

public class Dev {

    private Computer comp;
    private int age;

    public Dev() {
        System.out.println("dev constructor");
    }

    public Dev(int age) {
        System.out.println("parameterized constructor");
        this.age = age;
    }

    // public Dev(int age, Laptop comp) {
    // System.out.println("parameterized constructor");
    // this.age = age;
    // this.comp = comp;
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        comp.compile();
        System.out.println("trying to working on one project");
    }
}
