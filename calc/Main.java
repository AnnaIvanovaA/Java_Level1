package com.levelup.calc;

import com.levelup.lesson5.MyArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by aivanova on 15.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Calculator");
        mainFrame.setBounds(300, 300, 300, 400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JTextArea text = new JTextArea(4, 25);
        text.requestFocus();


        JPanel inputButtonsPanel = new JPanel(new GridLayout(4,3,5,5));
        String[] digitsArray = {",","0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        JButton[] digitsButtonsArray = new JButton[digitsArray.length];
        for (int i = digitsArray.length -1; i >= 0 ; i--) {
            digitsButtonsArray[i] = new JButton(digitsArray[i]);
            inputButtonsPanel.add(digitsButtonsArray[i]);
        }

        JPanel commandButtonsPanel = new JPanel(new GridLayout(4,2,5,5));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton devide = new JButton("/");
        JButton equals = new JButton("=");
        JButton backspace = new JButton("<-");
        JButton erase = new JButton("C");
        JButton procent = new JButton("%");

        commandButtonsPanel.add(plus);
        commandButtonsPanel.add(minus);
        commandButtonsPanel.add(multiply);
        commandButtonsPanel.add(devide);
        commandButtonsPanel.add(equals);
        commandButtonsPanel.add(backspace);
        commandButtonsPanel.add(erase);
        commandButtonsPanel.add(procent);


        for (JButton button : digitsButtonsArray) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setText(button.getText());
                }
            });
        }




        mainFrame.add(BorderLayout.NORTH, text);
        mainFrame.add(BorderLayout.CENTER, inputButtonsPanel);
        mainFrame.add(BorderLayout.EAST, commandButtonsPanel);
        //mainFrame.add(panel);
        mainFrame.setVisible(true);


    }
}
