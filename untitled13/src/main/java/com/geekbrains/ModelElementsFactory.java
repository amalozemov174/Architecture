package com.geekbrains;

public class ModelElementsFactory {

    public ModelElement createModelElement (ModelType type) {
        ModelElement modelElement = null;

        switch(type) {
            case Flash:
                modelElement = new Flash();
                break;
            case Camera:
                modelElement = new Camera();
                break;
        }

        return modelElement;
    }

}
