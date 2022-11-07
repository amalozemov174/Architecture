package com.geekbrains;

public enum FigureType {
    Triangle("Triangle"),
    Square("Square"),
    Rectangle("Rectangle"),
    Circle("Circle");

    private String type;

    FigureType (String type) {
        this.type = type;
    }
}

