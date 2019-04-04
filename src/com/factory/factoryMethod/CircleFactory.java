package com.factory.factoryMethod;

import com.factory.simpleFactory.Circle;
import com.factory.simpleFactory.Shape;

public class CircleFactory implements Factory{
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return new Circle();
    }
}
