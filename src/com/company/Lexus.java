package com.company;

public  class Lexus extends Car {

    public Lexus(String name) {
        super(name);
    }
    public int price;
    public String color;
    public int age;


    @Override
    public void print() {
        System.out.println("name" + getName() + " " + "age" + getAge() + " " + "color" + getColor() + " " + "price" + getPrice());
    }

    public Lexus(String name, int price, String color, int age) {
        super(name);
        this.price = price;
        this.color = color;
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
