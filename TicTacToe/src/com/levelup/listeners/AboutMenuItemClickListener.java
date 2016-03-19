package com.levelup.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 19.03.2016.
 */
public class AboutMenuItemClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame mainFrame= new JFrame("About");

        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setBounds(300, 300, 200, 200);
        mainFrame.setMinimumSize(new Dimension(200, 200));




        //aboutDialog.setContentPane(new BoxLayout(200, 200));

        JLabel name = new JLabel("Notes");


        mainFrame.add(BorderLayout.CENTER, name);
        mainFrame.setVisible(true);



    }
}
