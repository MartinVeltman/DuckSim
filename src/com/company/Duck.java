package com.company;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void display(Duck duck){
        duck.flyBehavior.fly();
        duck.quackBehavior.quack();
        duck.swim();
    }

    public void swim(){
        System.out.println("All ducks swim");
    }

}
