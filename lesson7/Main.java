package com.levelup.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aivanova on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Text editor");
        mainFrame.setBounds(300, 300, 500, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea text = new JTextArea(10, 20);
        text.requestFocus();

        JButton lowerBtn = new JButton("Make font size smaller");
        lowerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font oldF = text.getFont();
                Font newF = new Font(oldF.getFontName(), oldF.getStyle(), oldF.getSize()-1);
                text.setFont(newF);
            }
        });

        JButton upperBtn = new JButton("Make font size bigger");
        upperBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font oldF = text.getFont();
                Font newF = new Font(oldF.getFontName(), oldF.getStyle(), oldF.getSize()+1);
                text.setFont(newF);
            }
        });

        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        JScrollPane scroller = new JScrollPane(text);
        scroller.setViewportView(text);
        //text.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        mainFrame.add(BorderLayout.NORTH, scroller);
        mainFrame.add(BorderLayout.WEST, lowerBtn);
        mainFrame.add(BorderLayout.CENTER, upperBtn);
        mainFrame.add(BorderLayout.EAST, clearBtn);



        mainFrame.setVisible(true);
    }
}
