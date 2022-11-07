package com.geekbrains;

import static com.geekbrains.FigureType.Circle;

public class FigureFabric {

//    Triangle,
//    Square,
//    Rectangle,
//    Circle

    private FigureFabric() {

    }

    public static Figure createModelElement (String type) {
        Figure figure = null;
        FigureType figureType = null;

        try {
            figureType = FigureType.valueOf(type);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Фигура не надйена: " + type);
        }

        if(figureType != null) {
            switch(figureType) {
                case Triangle:
                    figure = new Triangle();
                    break;
                case Square:
                    figure = new Square();
                    break;
                case Rectangle:
                    figure = new Rectangle();
                    break;
                case Circle:
                    figure = new Circle();
                    break;
            }
        }

        return figure;
    }

}
