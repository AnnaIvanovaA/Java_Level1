package com.levelup.ui;

import com.levelup.listeners.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Student-01 on 18.03.2016.
 */

public class GUI {
    public void start(){
        JFrame mainFrame= new JFrame("TicTacToe");

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 100, 300, 300);
        mainFrame.setMinimumSize(new Dimension(300, 300));

        //JMenuBar, JMenu, JMenuItem
        JMenuBar bar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenu helpMenu = new JMenu("Help");
        JMenu settingsMenu= new JMenu("Settings");
        JMenuItem newGameMenuItem = new JMenuItem("New Game");
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        JMenuItem viewSettingsMenuItem = new JMenuItem("View settings");
        JMenuItem rulesSettingsMenuItem = new JMenuItem("Rules");
        JMenuItem aboutMenuItem = new JMenuItem("About");

        //settingsMenu.setIcon(new ImageIcon("icons/ic_settings.jpg"));

        //Listeners for Menu Items

        quitMenuItem.addActionListener(new QuitMenuClickListener());
        aboutMenuItem.addActionListener(new AboutMenuItemClickListener());

        helpMenu.add(aboutMenuItem);
        settingsMenu.add(viewSettingsMenuItem);
        settingsMenu.add(rulesSettingsMenuItem);
        gameMenu.add(newGameMenuItem);
        gameMenu.add(settingsMenu);
        gameMenu.add(quitMenuItem);
        bar.add(gameMenu);
        bar.add(helpMenu);


        mainFrame.setJMenuBar(bar); //north is still empty



        JPanel playgroundPanel = new JPanel();
        playgroundPanel.setLayout(new GridLayout(3, 3));

        JButton[] buttons = new JButton[9];

        //Listener for x and o buttons
        //OnGameButtonClickListener gameListener = new OnGameButtonClickListener();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            playgroundPanel.add(buttons[i]);
            //buttons[i].addActionListener(gameListener);
        }

        OnGameButtonClickListener gameListener = new OnGameButtonClickListener(buttons);
        CheckForTheVictoryListener victoryListener = new CheckForTheVictoryListener(buttons);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(gameListener);
            buttons[i].addActionListener(victoryListener);
        }


        JPanel footer= new JPanel();
        JButton newGameBtn = new JButton("New Game");
        JButton quitButton = new JButton("Quit");
        footer.add(newGameBtn);
        footer.add(quitButton);


        NewGameClickListener newGameMenuListener = new NewGameClickListener(buttons);
        newGameBtn.addActionListener(newGameMenuListener);

        newGameMenuItem.addActionListener(new NewGameClickListener(buttons));



        quitButton.addActionListener(new QuitMenuClickListener());

        mainFrame.add(BorderLayout.CENTER, playgroundPanel);
        mainFrame.add(BorderLayout.SOUTH, footer);

        mainFrame.setVisible(true);
    }
}
