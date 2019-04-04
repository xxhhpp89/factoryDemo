package com.factory.factoryMethod;

import com.factory.simpleFactory.Rectangle;
import com.factory.simpleFactory.Shape;

public class RectangleFactory implements Factory{
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return new Rectangle();
    }
}
