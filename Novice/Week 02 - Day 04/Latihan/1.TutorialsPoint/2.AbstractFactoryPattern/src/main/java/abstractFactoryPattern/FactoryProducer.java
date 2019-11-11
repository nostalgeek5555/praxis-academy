package abstractFactoryPattern;

import abstractFactoryPattern.RoundedShapeFactory;
import abstractFactoryPattern.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if(rounded){
            return new RoundedShapeFactory();
        }
        else {
            return new ShapeFactory();
        }
    }
}