/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // variables importantes
        boolean bandera = true;
        double notas;
        int cont = 1;
        int op;
        double[] valid = new double[6];
        String[] rangos = {"20-mas","19.1-20","16.1-19","12.1-16","8.1-12","0-8"};
        // ciclo repetitivo para preguntar al usuario
        while (bandera == true) {
            System.out.printf("Ingrese las notas del estudiante\n");
            notas = entrada.nextDouble();
               // Condicionales para guardar en que rangos se encuentra
                if (notas > 20.1) {
                    valid[0] = valid[0] + 1;
                }
                if (notas > 19.1 && notas < 20) {
                    valid[1] = valid[1] + 1;
                }
                if (notas > 16.1 && notas < 19.1) {
                    valid[2] = valid[2] + 1;
                }
                if (notas > 12.1 && notas < 16.1) {
                    valid[3] = valid[3] + 1;
                }
                if (notas > 8.6 && notas < 12) {
                    valid[4] = valid[4] + 1;
                }
                if (notas > 0 && notas < 8) {
                    valid[5] = valid[5] + 1;
                }
                // Para ingresar mas datos preguntamos al usuario
                System.out.printf("Desea ingresar mas notas\n1._Si\n2._No\n"
                    + "presione  la tecla 1 o 2 para continuar\n");
            op = entrada.nextInt();
            if(op == 2){
                bandera = false;
            }
        }
        // Impresion de resultados
       for(int i = 0; i < valid.length;i++){
           System.out.printf("Notas ingresadas\n%s = %.2f\n", rangos[i], valid[i]); 
       }
    }
}