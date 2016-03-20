package com.levelup;

import java.util.Stack;

/**
 * Created by Student-20 on 20.03.2016.
 */
public class CalculatorModel {
    private View view;
    private int operationCount = 0;
    private Stack<Double> operands;
    private Stack<String> operations;


    private Double result = 0.0;

    public CalculatorModel() {
        operands = new Stack<>();
        operations = new Stack<>();
    }

    public void operate (String operand1, String operation){
        double op1 = Double.parseDouble(operand1);
        operands.push(op1);
        //this.operation = operation;

        if (operation.equals("=")){
            for (int i = 0; i < operationCount-1; i++) {
                if (operations.peek().equals("+")){
                    result = operands.pop() + operands.pop();
                }
                if (operations.peek().equals("-")){
                    result = operands.pop() - operands.pop();
                }
                if (operations.peek().equals("*")){
                    result = operands.pop() * operands.pop();
                }
                if (operations.pop().equals("/")){
                    result = operands.pop() / operands.pop();
                }
                operations.pop();
            }
            view.setResult(result);
            operationCount = 0;
            result = 0.0;
        } else{
            view.setEmpty();
            operations.push(operation);
            operationCount++;
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
