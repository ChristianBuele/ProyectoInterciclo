import Controlador.ControladorPrincipal;
import Modelo.operaciones;
import Vista.principal;

import javax.swing.*;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        principal pri = new principal();
        operaciones op=new operaciones();
        ControladorPrincipal ctrl=new ControladorPrincipal(pri,op);
        ctrl.iniciar();
    }
}
