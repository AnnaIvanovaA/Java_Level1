package com.levelup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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

        ActionListener saveMenuItemListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                BufferedReader reader = null;
                PrintWriter writer = null;
                try {
                    reader = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream("")
                            )
                    );

                    writer = new PrintWriter(
                            //new FileOutputStream("output.txt", true), false
                            new FileOutputStream("output.txt"), false
                    ); //true - data in the end, false - autoflush

                } catch (FileNotFoundException m){
                    m.printStackTrace();
                }

                if (writer != null ){
                    int bufferSize = 0;
                    String line;
                    try {
                        while ((line = reader.readLine()) != null) {
                            writer.println(line);
                            bufferSize++;
                            if (bufferSize == 3) {
                                writer.flush();
                                bufferSize = 0;
                            }
                        }
                    } catch (IOException m){
                        m.printStackTrace();
                    }

                    writer.flush(); //вызывается перед закрытием потока, очищает буффер, запись в файл
                    writer.close(); //запись только когда закрывается поток
                }
                if (reader != null){
                    try {
                        reader.close();
                    } catch (IOException m){
                        m.printStackTrace();
                    }

                }
            }
        };

        JMenuBar bar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenuItem = new JMenuItem("Save");

        saveMenuItem.addActionListener(saveMenuItemListener);

        fileMenu.add(saveMenuItem);
        bar.add(fileMenu);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setViewportView(text);
        text.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        mainFrame.add(BorderLayout.NORTH, scroller);
        mainFrame.add(BorderLayout.WEST, lowerBtn);
        mainFrame.add(BorderLayout.CENTER, upperBtn);
        mainFrame.add(BorderLayout.EAST, clearBtn);
        mainFrame.setJMenuBar(bar);
        
        mainFrame.setVisible(true);
    }
}
