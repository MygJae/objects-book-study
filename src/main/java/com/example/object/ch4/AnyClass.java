package com.example.object.ch4;

public class AnyClass {
    void anyMethod(Rectangle rectangle, int multiple) {
        rectangle.setRight(rectangle.getRight()*multiple);
        rectangle.setBottom(rectangle.getBottom()*multiple);
    }
}
