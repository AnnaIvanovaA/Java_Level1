package com.levelup.logic;

import javax.swing.*;

/**
 * Created by Anna on 19.03.2016.
 */
public class GameLogic {

    private JButton[] buttons;


    public GameLogic(JButton[] buttons){
        this.buttons=buttons;
    }

    public void checkForTheVictory(JButton[] btn){

        //check rows
        if (((btn[0].getText() == "X") && (btn[1].getText() == "X") && (btn[2].getText() == "X")) ||
                ((btn[3].getText() == "X") && (btn[4].getText() == "X") && (btn[5].getText() == "X")) ||
                ((btn[6].getText() == "X") && (btn[7].getText() == "X") && (btn[8].getText() == "X")))
        {
            JOptionPane.showMessageDialog(null, "X win!");
        }

        if (((btn[0].getText() == "O") && (btn[1].getText() == "O") && (btn[2].getText() == "O")) ||
                ((btn[3].getText() == "O") && (btn[4].getText() == "O") && (btn[5].getText() == "O")) ||
                ((btn[6].getText() == "O") && (btn[7].getText() == "O") && (btn[8].getText() == "O")))
        {
            JOptionPane.showMessageDialog(null, "O win!");
        }

        //check columns
        if (((btn[0].getText() == "X") && (btn[3].getText() == "X") && (btn[6].getText() == "X")) ||
                ((btn[1].getText() == "X") && (btn[4].getText() == "X") && (btn[7].getText() == "X")) ||
                ((btn[2].getText() == "X") && (btn[5].getText() == "X") && (btn[8].getText() == "X")))
        {
            JOptionPane.showMessageDialog(null, "X win!");
        }

        if (((btn[0].getText() == "O") && (btn[3].getText() == "O") && (btn[6].getText() == "O")) ||
                ((btn[1].getText() == "O") && (btn[4].getText() == "O") && (btn[7].getText() == "O")) ||
                ((btn[2].getText() == "O") && (btn[5].getText() == "O") && (btn[8].getText() == "O")))
        {
            JOptionPane.showMessageDialog(null, "O win!");
        }

        //check diagonals
        if (((btn[0].getText() == "X") && (btn[4].getText() == "X") && (btn[8].getText() == "X")) ||
                ((btn[2].getText() == "X") && (btn[4].getText() == "X") && (btn[6].getText() == "X")))
        {
            JOptionPane.showMessageDialog(null, "X win!");
        }

        if (((btn[0].getText() == "O") && (btn[4].getText() == "O") && (btn[8].getText() == "O")) ||
                ((btn[2].getText() == "O") && (btn[4].getText() == "O") && (btn[6].getText() == "O")))
        {
            JOptionPane.showMessageDialog(null, "O win!");
        }



//        if (btn[0].getText() == "X"){
//            JOptionPane.showMessageDialog(null, "X win!");
//
//        }
//        if (btn[1].getText() == "O"){
//            JOptionPane.showMessageDialog(null, "O win!");
//        }

        for (JButton b : buttons) {
            if (b.getText().equals("")){
                System.out.println("null");
            } else{
                System.out.println(b.getText());
            }
        }


    }

}
