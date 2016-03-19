package com.levelup.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 19.03.2016.
 */
public class NewGameClickListener implements ActionListener{

    private JButton[] buttons;


    public NewGameClickListener(JButton[] buttons){
            this.buttons=buttons;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JButton btn : buttons) {
          btn.setText("");
        }
    }


}
