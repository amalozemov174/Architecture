package com.geekbrains;

public class Main {

    public static void main(String[] args) {
        ModelElementsFactory factory = new ModelElementsFactory();
        ModelElement camera = factory.createModelElement(ModelType.Camera);
        ModelElement flash = factory.createModelElement(ModelType.Flash);
    }

}
