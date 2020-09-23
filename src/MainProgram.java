import control.MainController;
import view.*;

import java.awt.*;

public class MainProgram {

    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        MainController mainController = new MainController();
        MainView mainView = new MainView(mainController, "GUI-Vorlage",25,25,1200,900);
    }

}