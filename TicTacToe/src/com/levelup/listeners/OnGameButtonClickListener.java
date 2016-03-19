package com.levelup.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 19.03.2016.
 */
public class OnGameButtonClickListener implements ActionListener{
    private boolean isX = true;
    private JButton btn = new JButton();

    @Override
    public void actionPerformed(ActionEvent e){
        JButton source = (JButton) e.getSource();
        btn = source;
        if (source.getText().isEmpty()){
            if (isX){
                source.setText("X");
            } else {
                source.setText("O");
            }
            isX = !isX;
        }
        source.
    }

    private JButton[] buttons;

    public OnGameButtonClickListener(JButton[] buttons){
        this.buttons=buttons;
    }
    public void updateButtonsArray(JButton[] buttons){


    }

}
