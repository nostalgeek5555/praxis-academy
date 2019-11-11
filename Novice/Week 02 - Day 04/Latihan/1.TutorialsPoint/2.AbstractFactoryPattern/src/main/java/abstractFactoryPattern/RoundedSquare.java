package abstractFactoryPattern;

import abstractFactoryPattern.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw()");
    }
}