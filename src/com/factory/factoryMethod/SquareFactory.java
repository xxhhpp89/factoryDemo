package com.factory.factoryMethod;

import com.factory.simpleFactory.Shape;
import com.factory.simpleFactory.Square;

public class SquareFactory implements Factory{
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return new Square();
    }
}
