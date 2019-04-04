package com.factory.factoryMethod;

import com.factory.simpleFactory.Shape;

public class Test {
    public static void main(String[] args) {
        Factory circlefactory = new CircleFactory();
        Shape circle = circlefactory.getShape();
        circle.draw();
    }
}
