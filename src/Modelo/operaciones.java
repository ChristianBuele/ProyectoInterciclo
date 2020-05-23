package Modelo;

import javax.swing.*;

public class operaciones {
    public operaciones() {
    }
    public String validarNumeros(String numero) {
        int a;
        try {
            a=Integer.valueOf(numero);
            boolean bandera=false;
            do {
                if(a < 0) {
                    a = a * -1;
                    bandera= true;
                }
                if(127 < a) {
                    JOptionPane.showMessageDialog(null, "Porfavor ingrese numeros que esten en el rango de -127 a 127");
                    return ("\nINVALID NUMBER.ENTER VALUE (-127 < A, B < 128)!");
                }
            } while(127< a);

            if(bandera)
                a = a *-1;
            return("true");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            return ("\nIngrese solo numeros porfavor");
        }

    }
    public void conversionBinario(int num,int arr[]) {
        int i,p=num;
        int[]c={0,0,0,0,0,0,0,1};
        for(i=0;i< 8;i++)
            arr[i] = 0;
        if(num < 0)
            num = num *-1;
        i = 7;
        do {
            arr[i]=num%2;
            num = num/2;
            i--;
        } while(num!=0);
        if(p< 0) {
            for(i=0;i< 8;i++)
                arr[i]=1-arr[i];
            //add(arr,c);
        }
    }
}
