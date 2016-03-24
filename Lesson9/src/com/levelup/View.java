package com.levelup.lesson9;

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

    private ActionListener memoryBtnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            model.operateWithMemory(display.getText(), button.getText());
        }
    };

    private ActionListener scientificViewListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addScientificPanel();
        }
    };

    private ActionListener scientificBtnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            model.operateWithFunctions(display.getText(), button.getText());
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
    public void setNewText(String text){
        display.setText(text);
    }


    private void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);
        setTitle("Calculator");

        JMenuBar bar = new JMenuBar();
        JMenu settingsMenu = new JMenu("Settings");
        JMenuItem viewMenu = new JMenu("View");
        JMenuItem standardViewMenuItem = new JMenuItem("Standard") ;
        JMenuItem scientificViewMenuItem = new JMenuItem("Scientific") ;

        //standardViewMenuItem.addActionListener();
        scientificViewMenuItem.addActionListener(scientificViewListener);


        viewMenu.add(standardViewMenuItem);
        viewMenu.add(scientificViewMenuItem);
        settingsMenu.add(viewMenu);
        bar.add(settingsMenu);

        JPanel northPanel = new JPanel(new GridLayout(2,1));
        display = new JLabel("0");

        JPanel numPanel = new JPanel(new GridLayout(4,3));
        JPanel eastPanel =new JPanel(new GridLayout(2,1));
        JPanel arithmeticPanel = new JPanel(new GridLayout(2,2));
        JPanel supportPanel = new JPanel (new GridLayout(1,6));

        JButton[] numBtns = new JButton[10];
        for (int i = 0; i < numBtns.length; i++) {
            numBtns[i] = new JButton(String.valueOf(i));
            numBtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    if (display.getText().equals("0")){
                        display.setText(button.getText());
                    } else{
                        display.setText(display.getText() + button.getText());
                    }


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
        JButton dotBtn = new JButton(".");
        dotBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!display.getText().contains("."))
                display.setText(display.getText() + ".");
            }
        });
        JButton unaryMinusBtu = new JButton("+/-");
        unaryMinusBtu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!display.getText().equals("0"))||(!display.getText().equals("0.0"))){
                    display.setText(String.valueOf( -Double.parseDouble(display.getText())));
                }
            }
        });

        numPanel.add(numBtns[0]);
        numPanel.add(dotBtn);
        numPanel.add(unaryMinusBtu);

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");
        JButton resultBtn = new JButton("=");

        JButton mcBtn = new JButton("MC");
        JButton mrBtn = new JButton("MR");
        JButton mPlusBtn = new JButton("M+");
        JButton mMinusBtn = new JButton("M-");
        JButton clearBtn = new JButton("C");
        JButton backspaceBtn = new JButton("<-");


        addBtn.addActionListener(arithmeticBtnListener);
        subBtn.addActionListener(arithmeticBtnListener);
        mulBtn.addActionListener(arithmeticBtnListener);
        divBtn.addActionListener(arithmeticBtnListener);
        resultBtn.addActionListener(arithmeticBtnListener);

        mcBtn.addActionListener(memoryBtnListener);
        mrBtn.addActionListener(memoryBtnListener);
        mPlusBtn.addActionListener(memoryBtnListener);
        mMinusBtn.addActionListener(memoryBtnListener);
        clearBtn.addActionListener(memoryBtnListener);
        backspaceBtn.addActionListener(memoryBtnListener);



        arithmeticPanel.add(addBtn);
        arithmeticPanel.add(subBtn);
        arithmeticPanel.add(mulBtn);
        arithmeticPanel.add(divBtn);

        supportPanel.add(mcBtn);
        supportPanel.add(mrBtn);
        supportPanel.add(mPlusBtn);
        supportPanel.add(mMinusBtn);
        supportPanel.add(clearBtn);
        supportPanel.add(backspaceBtn);

        eastPanel.add(arithmeticPanel);
        eastPanel.add(resultBtn);

        northPanel.add(display);
        northPanel.add(supportPanel);

        setJMenuBar(bar);
        add(BorderLayout.NORTH, northPanel);
        add(BorderLayout.CENTER, numPanel);
        add(BorderLayout.EAST, eastPanel);

    }

    private void addScientificPanel(){
        setBounds(200, 200, 400, 500);
        JPanel westPanel = new JPanel(new GridLayout(5,2));

        JButton sinBtn = new JButton("sin");
        JButton cosBtn = new JButton("cos");
        JButton tgBtn = new JButton("tg");
        JButton arctg = new JButton("arctg");
        JButton lnBtn = new JButton("ln");

        JButton lgBtn = new JButton("lg");
        JButton log2Btn = new JButton("log2");
        JButton x2Btn = new JButton("x^2");
        JButton sqrtBtn = new JButton("sqrt");
        JButton powerBtn = new JButton("^");

        sinBtn.addActionListener(scientificBtnListener);
        cosBtn.addActionListener(scientificBtnListener);
        tgBtn.addActionListener(scientificBtnListener);
        arctg.addActionListener(scientificBtnListener);
        lnBtn.addActionListener(scientificBtnListener);

        lgBtn.addActionListener(scientificBtnListener);
        log2Btn.addActionListener(scientificBtnListener);
        x2Btn.addActionListener(scientificBtnListener);
        sqrtBtn.addActionListener(scientificBtnListener);
        powerBtn.addActionListener(scientificBtnListener);

        westPanel.add(sinBtn);
        westPanel.add(cosBtn);
        westPanel.add(tgBtn);
        westPanel.add(arctg);
        westPanel.add(lnBtn);

        westPanel.add(lgBtn);
        westPanel.add(log2Btn);
        westPanel.add(x2Btn);
        westPanel.add(sqrtBtn);
        westPanel.add(powerBtn);

        add(BorderLayout.WEST, westPanel);
    }

}
