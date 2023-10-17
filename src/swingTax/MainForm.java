package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane ivaPane;
    private JTextPane totalPane;
    private JButton buttonCalculate;
    private JPanel taxPane;
    private JList list1;

    public ActionListener botonPulsado(ActionEvent e) {
    }
    public MainForm() {
        buttonCalculate.addActionListener(botonPulsado());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
    }
}
