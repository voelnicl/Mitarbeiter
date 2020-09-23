package view;

import control.*;
import javax.swing.*;

/**
 * Created by Ambrosius on 11.09.2020.
 */
public class MainView2 extends JFrame {

    // Attribute

    // Referenzen
    private MainController mainController;
    private PanelHandler panelHandler;
    private PanelHandler2 panelHandler2;


    /**
     * Konstruktor
     * @param name Der Titel des Fensters
     * @param x Die obere linke x-Koordinate des Fensters bzgl. des Bildschirms
     * @param y Die obere linke y-Koordinaite des Fensters bzgl. des Bildschirms
     * @param width Die Breite des Fensters
     * @param height Die Höhe des Fensters
     */
    public MainView2(MainController mainController, String name, int x, int y, int width, int height) {
        this.mainController = mainController;
        this.panelHandler2 = new PanelHandler2 (mainController);

        this.setLocation(x,y);
        this.setSize(width,height);
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setVisible(true);

        this.switchToPanel(panelHandler2.getPanel());

    }

    /**
     * Mithilfe dieser Methode wird das übergebene JPanel-Objekt im Fenster angezeigt. Hierzu wird das aktuell vorhandene JPanel-Objekt zunächst entfernt.
     * @param panel Das JPanel-Obejkt, das angezeigt werden soll.
     */
    public void switchToPanel(JPanel panel){
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
        this.validate();
        this.repaint();
    }

}

