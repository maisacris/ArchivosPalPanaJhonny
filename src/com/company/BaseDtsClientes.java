package com.company;

import java.util.Scanner;

public class BaseDtsClientes {


        private int i,j,k;
        private Scanner nombres = new Scanner(System.in);

        public void ingresarDatos() {

            String [][] matrizRecolectora = new String[2][10];

            for (this.i =0; this.i<10; this.i++ ){
                System.out.println("favor ingrese el nombre del cliente ");
                matrizRecolectora[0][i] = nombres.nextLine();
            }

            System.out.println("            ");


            for ( this.j = 0; this.j<10; this.j++){

                System.out.println("ingrese la identificacion del cliente");
                matrizRecolectora[1][j] = nombres.nextLine();
            }

            System.out.println("            ");


            for(this.k =0;this.k <10 ; this.k++){

                        System.out.print("Nombre: "+ matrizRecolectora[0][k]+"  ");
                        System.out.print("// Identificacion: "+ matrizRecolectora[1][k]+" ");
                        System.out.println("   ");
            }






        }    //metodo vacio
}//clase
