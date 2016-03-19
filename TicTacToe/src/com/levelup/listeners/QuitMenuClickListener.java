package com.levelup.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 19.03.2016.
 */
public class QuitMenuClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }

}
