package com.company;

public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
