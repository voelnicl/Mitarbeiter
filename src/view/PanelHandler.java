package view;

import control.MainController;
import model.*;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PanelHandler {


    private MainController mainController;
    private MainView mainView;
    private MainView2 mainView2;
    private PanelHandler2 panelHandler2;
    private JPanel panelS;
    private JLabel LabelGeburtsdatum;
    private JLabel LabelGehalt;
    private JLabel LabelName;
    private JLabel LabelAdresse;
    private JLabel LabelTel;
    private JLabel LabelEMail;
    private JLabel LabelFirma;
    private JLabel LName;
    private JLabel LGeburt;
    private JLabel LAdresse;
    private JLabel LTel;
    private JLabel LEMail;
    private JLabel LFirma;
    private JLabel LGehalt;
    private JButton button1;
    private JLabel LIdent;
    private Datenblatt datenblatt;

    public PanelHandler(MainController mainController) {
        this.mainController = mainController;
        //createButtons();
        updateGUI();
        LabelName.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelName.setText("Name:");
            }
        });
        LabelGeburtsdatum.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelGeburtsdatum.setText("Geburtsdatum:");
            }
        });
        LabelAdresse.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelAdresse.setText("Adresse:");
            }
        });
        LabelTel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelTel.setText("Telefonnr.:");
            }
        });
        LabelEMail.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelEMail.setText("E-Mail::");
            }
        });
        LabelFirma.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelFirma.setText("Firma:");
            }
        });
        LabelGehalt.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LabelGehalt.setText("Gehalt:");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainView2 mainView2 = new MainView2(mainController, "GUI-Vorlage",25,25,1200,900);
                mainView2.switchToPanel(panelHandler2.getPanel());
            }
        });
    }

    public void updateGUI() {
        String[] output;
        output = mainController.alleStringDaten();

        ComponentAdapter listener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                LName.setText(output[0]);
                LGeburt.setText(output[1]);
                LAdresse.setText(output[2]);
                LTel.setText(output[3]);
                LEMail.setText(output[4]);
                LFirma.setText(output[5]);
                LGehalt.setText(String.valueOf(mainController.getGehalt()) + "€");
            }
        };
        LIdent.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                super.componentResized(componentEvent);
                LIdent.setText(String.valueOf(mainController.getIdent()));
            }
        });
        LName.addComponentListener(listener);
        LGeburt.addComponentListener(listener);
        LAdresse.addComponentListener(listener);
        LTel.addComponentListener(listener);
        LEMail.addComponentListener(listener);
        LFirma.addComponentListener(listener);
        LGehalt.addComponentListener(listener);
    }

    public JPanel getPanel(){
        return panelS;
    }

}
