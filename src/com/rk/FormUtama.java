package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JFormattedTextField textField;

    public FormUtama() {
        super("Email Input");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        setPreferredSize(new Dimension(350, 170));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        AturInputEmail("Email 1");
        AturInputEmail("Email 2");
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void AturInputEmail(String Teks) {
        JFormattedTextField textField;
        JLabel label;

        label = new JLabel(Teks);
        label.setFont(new Font("Cambria", Font.PLAIN, 12));

        add(label);
        textField = new JFormattedTextField(new EmailFormatter());
        textField.setFont(new Font("Cambria", Font.PLAIN, 12));
        textField.setPreferredSize(new Dimension(250, 36));
        add(textField);
    }
}
