package com.aim.designpattern.create.abstractfactory;

import com.aim.designpattern.create.abstractfactory.AbstractFactory;
import com.aim.designpattern.create.abstractfactory.Color;
import com.aim.designpattern.create.abstractfactory.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
