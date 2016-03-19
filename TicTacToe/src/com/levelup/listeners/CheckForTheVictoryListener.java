package com.levelup.listeners;

import com.levelup.logic.GameLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 19.03.2016.
 */
public class CheckForTheVictoryListener implements ActionListener {

    private JButton[] buttons;

    public CheckForTheVictoryListener(JButton[] buttons){
        this.buttons=buttons;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameLogic btn = new GameLogic(buttons);
        btn.checkForTheVictory(buttons);
    }
}
