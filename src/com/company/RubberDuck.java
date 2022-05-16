package com.company;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNotPossible();
        quackBehavior = new Squeack();
    }
}
