package Controlador;

import Modelo.operaciones;
import Vista.principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {
    private final principal view;
    private final operaciones model;
    private int[] Q=new int[8];
    private int[] M=new int[8];
    private String salida="";

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
    public void arranca(String num,int [] arreglo){
        int a=Integer.valueOf(num);
        model.binary(a,arreglo);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.calcularButton){
            if(!view.formattedTextFieldnumero1.getText().toString().isEmpty() && !view.formattedTextFieldnumero2.getText().toString().isEmpty()){
                String dato=model.validarNumeros(view.formattedTextFieldnumero1.getText().toString());
                if(!dato.equals("true")){
                    JOptionPane.showMessageDialog(null,dato);
                }else{
                    arranca(view.formattedTextFieldnumero1.getText(),M);
                    arranca(view.formattedTextFieldnumero2.getText(),Q);
                    salida+="El numero "+view.formattedTextFieldnumero1.getText()+" en binario es: "+model.BinarioString(M)+"\n";
                    salida+="El numero "+view.formattedTextFieldnumero2.getText()+" en binario es: "+model.BinarioString(Q)+"\n";
                    view.textArea1.setText(salida);
                }
            }else {
                JOptionPane.showMessageDialog(null,"No Se han llenado los valores");
            }
        }
    }
}
