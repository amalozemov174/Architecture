package com.geekbrains;

public class Rectangle extends Figure {
    @Override
    public void getPerimeter() {
        System.out.println("Периметр Прямоугольника");
    }

    @Override
    public void getSquare() {
        System.out.println("Площадь Прямоугольника");
    }
}
