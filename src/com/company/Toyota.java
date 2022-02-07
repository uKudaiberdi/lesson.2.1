package com.company;

public class Toyota extends Car {
    public Toyota(String name) {
        super(name);
    }
    public String color;
    public int age;


    @Override
    public void print() {
        System.out.println("name" + getName() + " " + "age" + getAge() + " " + "color" + getColor());
    }

    public Toyota(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

