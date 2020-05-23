package Modelo;

import javax.swing.*;

public class operaciones {
    public operaciones() {
    }
    public static String validarNumeros(int num) {
        boolean bandera=false;
        do {
            if(num < 0) {
                num = num * -1;
                bandera = true;
            }
            if(127 < num)
                JOptionPane.showMessageDialog(null,"Ingrese un numero que se encuentre entre -127 a 127");
                return("\nError numeros fuera del rango");
        } while(127< num);

        if(bandera==true) {
            num = num * -1;
            return ("true");
        }
    }
}
