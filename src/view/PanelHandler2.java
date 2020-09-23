package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class PanelHandler2 {

    private MainController mainController;
    private MainView2 mainView2;
    private MainView mainView1;
    private JPanel panelAE;
    private JLabel LabelGeburtsdatum;
    private JLabel LabelGehalt;
    private JLabel LabelName;
    private JLabel LabelAdresse;
    private JLabel LabelEMail;
    private JLabel LabelFirma;
    private JTextField textFieldAdresse;
    private JTextField textFieldGeb;
    private JTextField textFieldName;
    private JTextField textFieldEMail;
    private JTextField textFieldFirma;
    private JTextField textFieldGehalt;
    private JButton buttonFertig;
    private JTextField textFieldTel;
    private PanelHandler panelHandler;

    public PanelHandler2 (MainController mainController) {
        this.mainController = mainController;
        ComponentAdapter listener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                String[] output = mainController.alleStringDaten();
                textFieldName.setText(output[0]);
                textFieldGeb.setText(output[1]);
                textFieldAdresse.setText(output[2]);
                textFieldTel.setText(output[3]);
                textFieldEMail.setText(output[4]);
                textFieldFirma.setText(output[5]);
                textFieldGehalt.setText(String.valueOf(mainController.getGehalt()));
            }
        };
        textFieldAdresse.addComponentListener(listener);
        textFieldGeb.addComponentListener(listener);
        textFieldName.addComponentListener(listener);
        textFieldEMail.addComponentListener(listener);
        textFieldFirma.addComponentListener(listener);
        textFieldGehalt.addComponentListener(listener);
        textFieldTel.addComponentListener(listener);
        buttonFertig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] output;
                output = new String[6];
                output[0] = textFieldName.getText();
                output[1] = textFieldGeb.getText();
                output[2] = textFieldAdresse.getText();
                output[3] = textFieldTel.getText();
                output[4] = textFieldEMail.getText();
                output[5] = textFieldFirma.getText();
                mainController.setDatenblattAlleWerte(output);
                panelHandler.updateGUI();
                mainView2.setVisible(false);
            }
        });
    }

    public JPanel getPanel(){
        return panelAE;
    }

}
