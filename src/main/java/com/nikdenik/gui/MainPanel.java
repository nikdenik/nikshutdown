package com.nikdenik.gui;

import javax.swing.*;

public class MainPanel {
    private JButton OKButton;
    private JButton pauseButton;
    private JButton stopButton;
    private JComboBox<String> commandTypeCombo;
    private JComboBox<String> timeRelationBox;
    private JTextArea textOre;
    private JTextArea textMinuti;
    private JPanel nikshutdownPanel;


    public MainPanel() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NikShutdown");
        frame.setContentPane(new MainPanel().nikshutdownPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }


}
