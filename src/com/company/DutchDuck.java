package com.company;

public class DutchDuck extends Duck{
    public DutchDuck(){
        flyBehavior = new FlyTheDutchWay();
        quackBehavior = new Quack();
    }
}
