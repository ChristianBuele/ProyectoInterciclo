package Modelo;

import javax.swing.*;

public class operaciones {
    public operaciones() {
    }
    public static String validarNumeros(String num) {
        boolean bandera=false;
        try{
            int a=Integer.valueOf(num);
            do {
                if(a < 0) {
                    a = a * -1;
                    bandera = true;
                }
                if(127 < a)
                  //   JOptionPane.showMessageDialog(null,"Ingrese un numero que se encuentre entre -127 a 127");
                    return("\nError numeros fuera del rango");
            } while(127< a);

            if(bandera==true) {
                a = a * -1;

            }
            return ("true");
        }catch (Exception e){

        }

return "";
    }
    public  void binary(int x,int arr[]) {
        System.out.println("");
        int i,p=x;
        int[]c={0,0,0,0,0,0,0,1};

        for(i=0;i< 8;i++)
            arr[i] = 0;
        if(x < 0)

            x = x *-1;
        i = 7;

        do {

            arr[i]=x%2;
            System.out.print(arr[i]+"..");
            x = x/2;
            i--;

        } while(x!=0);
        System.out.println("");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+":");
        }//

        if(p< 0) {

            for(i=0;i< 8;i++)
                //    System.out.print(arr[i]);
                arr[i]=1-arr[i];
            //  System.out.print("+"+arr[i]);
            add(arr,c);
        }
    }
    public static void add(int a[],int b[]) {

        int x,i,c=0;

        for(i=7;i>=0;i--) {

            x=a[i];
            a[i]=c^x^b[i];

            if(((c==1)&&(x==1))||((x==1)&&(b[i]==1))||((b[i]==1)&&(c==1)))

                c = 1;

            else

                c = 0;
        }
    }


    public String BinarioString(int [] arr){
        String numero="";
        for (int i = 0; i < arr.length; i++) {
            numero+=arr[i];
        }
        return numero;
    }


}
