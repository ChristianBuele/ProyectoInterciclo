package Controlador;

import Modelo.operaciones;
import Vista.principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {
    private final principal view;
    private final operaciones model;

    public ControladorPrincipal(principal view, operaciones model) {
        this.view=view;
        this.model=model;
        this.view.calcularButton.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Algoritmo de Booth");
        view.setSize(700,700);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.calcularButton){
            if(!view.formattedTextFieldnumero1.getText().toString().isEmpty() && !view.formattedTextFieldnumero2.getText().toString().isEmpty()){
                model.validarNumeros(view.formattedTextFieldnumero1.getText().toString());
            }else {
                JOptionPane.showMessageDialog(null,"No Se han llenado los valores");
            }
        }
    }
}
