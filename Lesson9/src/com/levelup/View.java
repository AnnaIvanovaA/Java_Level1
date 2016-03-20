package com.levelup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Student-20 on 20.03.2016.
 */
public class View  extends JFrame {

    private JLabel display;
    private CalculatorModel model;

    private ActionListener arithmeticBtnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            model.operate(display.getText(), button.getText());

        }
    };



    public View(CalculatorModel model) {
        this.model = model;
        init();
        model.setView(this);
    }

    public void setResult(Double result){
        String resultText = String.valueOf(result);
        display.setText(resultText);
    }
    public void setEmpty(){
        display.setText("0");
    }


    private void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,300,300);
        setTitle("Calculator");

        display = new JLabel("0");

        JPanel numPanel = new JPanel(new GridLayout(4,3));
        JPanel eastPanel =new JPanel(new GridLayout(2,1));
        JPanel arithmeticPanel = new JPanel(new GridLayout(2,2));
        JPanel supportPanel = new JPanel (new GridLayout(2,2));

        JButton[] numBtns = new JButton[10];
        for (int i = 0; i < numBtns.length; i++) {
            numBtns[i] = new JButton(String.valueOf(i));
            numBtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    display.setText(display.getText() + button.getText());

                }
            });
        }
        for (int i = 7; i < 10; i++) {
            numPanel.add(numBtns[i]);
        }
        for (int i = 4; i < 7; i++) {
            numPanel.add(numBtns[i]);
        }
        for (int i = 1; i < 4; i++) {
            numPanel.add(numBtns[i]);
        }
        numPanel.add(numBtns[0]);

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");
        JButton resultBtn = new JButton("=");

        addBtn.addActionListener(arithmeticBtnListener);
        subBtn.addActionListener(arithmeticBtnListener);
        mulBtn.addActionListener(arithmeticBtnListener);
        divBtn.addActionListener(arithmeticBtnListener);
        resultBtn.addActionListener(arithmeticBtnListener);

        arithmeticPanel.add(addBtn);
        arithmeticPanel.add(subBtn);
        arithmeticPanel.add(mulBtn);
        arithmeticPanel.add(divBtn);
        eastPanel.add(arithmeticPanel);
        eastPanel.add(resultBtn);

        add(BorderLayout.NORTH, display);
        add(BorderLayout.CENTER, numPanel);
        add(BorderLayout.EAST, eastPanel);

    }



}
