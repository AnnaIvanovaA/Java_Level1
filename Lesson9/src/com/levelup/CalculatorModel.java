package com.levelup.lesson9;

import java.util.Stack;

/**
 * Created by Student-20 on 20.03.2016.
 */
public class CalculatorModel {
    private View view;
    private String operation;
    private Stack<Double> operands;
    private Stack<String> operations;
    private String displayText;
    private Double result;
    private Double memory;
    private Double functionResult;


    public CalculatorModel() {
        operands = new Stack<>();
        operations = new Stack<>();
        result = 0.0;
        memory = 0.0;
        functionResult = 0.0;
    }

    public void operate (String operand1, String operation){
        double op1 = Double.parseDouble(operand1);
        this.operation = operation;

        //if it's the first entry - save operand 1 and operation
        if (operands.isEmpty()) {
            operands.push(op1);
            operations.push(operation);
            view.setNewText("0");

        } //if not - check the previous operation and make a calculation
        else {
                if (operations.peek().equals("+")) {
                    result = operands.pop() + op1;
                } else if (operations.peek().equals("-")) {
                    result = operands.pop() - op1;
                } else if (operations.peek().equals("*")) {
                    result = operands.pop() * op1;
                } else if (operations.peek().equals("/")) {
                    result = operands.pop() / op1;
                }

            operands.push(result);

                if (operation.equals("=")) {
                    view.setResult(result);  //display the result of calculation
                    operands.clear();

                } else {                       //save the result as operand 1 and the new operation for the next calculation
                    operations.push(operation);
                    view.setNewText("0");
                }
            }

    }

    public void operateWithMemory (String displayText, String operation){
        this.displayText = displayText;
        this.operation = operation;


        if (operation.equals("C")){
            view.setNewText("0");
            operands.clear();
            operations.clear();
        }

        if (operation.equals("<-")){
            char[] charArray = displayText.toCharArray();
            String newDisplayText = "";
            for (int i = 0; i < charArray.length - 1; i++) {
                newDisplayText += charArray[i];
            }
            view.setNewText(newDisplayText);
        }

        if (operation.equals("MC")){
            memory = 0.0;
            view.setResult(0.0);
        }
        if (operation.equals("MR")){
            view.setResult(memory);
        }
        if (operation.equals("M+")){
            memory += Double.parseDouble(displayText);
        }
        if (operation.equals("M-")){
            memory -= Double.parseDouble(displayText);
        }

    }

    public void operateWithFunctions (String operand, String operation){
        Double op = Double.parseDouble(operand);
        this.operation = operation;


        if (operation.equals("sin")){
            view.setResult(Math.sin(op));
        }
        if (operation.equals("cos")){
            view.setResult(Math.cos(op));
        }
        if (operation.equals("tg")){
            view.setResult(Math.tan(op));
        }
        if (operation.equals("arctg")){
            view.setResult(Math.atan(op));
        }


    }

    public void setView (View view){
        this.view = view;
    }


}
/*
отследить ввод второго операнда
изменить оперэйт для вычисления суммы и показ результата
1+2 + -- посчитать результат --записать в стек как первый операнд
кнопки . и +-
вспомогательные кнопки
функциональные - синус косинус тангенс арктангенс логарифм натуральный лн, десятичный лг, лог2, квадрат числа, корень, в степень
красивый калькулятор
возможность в верхнем меню убирать панель функциональных кнопок
 */
