package com.geekbrains;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Figures figures = new Figures();
        figures.addFigure("Rectangle");
        figures.addFigure("Square");
        figures.addFigure("Triangle");
        figures.addFigure("Circle");
        figures.addFigure("Poligon");

        figures.getAllPerimeters();
        figures.getAllSquares();
    }

}
