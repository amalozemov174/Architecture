package com.geekbrains;

import java.util.ArrayList;

public class Figures {
    private ArrayList<Figure> figures = new ArrayList<>();

    public void addFigure(String figure) {
        Figure fig = FigureFabric.createModelElement(figure);
        if (fig != null) {
            figures.add(fig);
        }
    }

    public void getAllPerimeters() {
        figures.forEach(figure -> figure.getPerimeter());
    }

    public void getAllSquares() {
        figures.forEach(figure -> figure.getSquare());
    }
}
