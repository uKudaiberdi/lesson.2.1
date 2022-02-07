package com.company;

public class Mercedes extends Car{
    public Mercedes(String name) {
        super(name);
    }
    public int age;


    @Override
    public void print() {
        System.out.println("name" + getName() + " " + "age" + getAge());

    }

    public Mercedes(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

