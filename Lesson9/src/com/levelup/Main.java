package com.levelup;

/**
 * Created by Student-20 on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();

        new View(model).setVisible(true);
    }
}
