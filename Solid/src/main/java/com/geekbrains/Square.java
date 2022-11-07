package com.geekbrains;

public class Square extends Figure {
    @Override
    public void getPerimeter() {
        System.out.println("Периметр Квадрата");
    }

    @Override
    public void getSquare() {
        System.out.println("Площадь Квадрата");
    }
}
