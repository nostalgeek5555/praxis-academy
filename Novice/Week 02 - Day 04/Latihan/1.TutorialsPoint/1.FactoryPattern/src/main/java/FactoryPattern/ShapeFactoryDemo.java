/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FactoryPattern;

import FactoryPattern.ShapeFactory;
import java.lang.*;
public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}