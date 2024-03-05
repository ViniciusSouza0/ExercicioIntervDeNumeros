package com.mycompany.exerciciodeintervalodenumeros;

import java.util.Scanner;

public class ExerciciodeIntervalodenumeros {

public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
        
        int x;
        
        x = teclado.nextInt();
        
        switch (x) {
            case 1: 
                 System.out.println("Número é 1");
                 if (x < 2) {
                     System.out.println("Número não é maior que 2");
                 }break;
            case 2:
                 System.out.println("Número é 2");
                break; 
            case 3:
                 System.out.println("Número é 3");
                if (x > 2) {
                     System.out.println("Número é maior que 2");
                }
                 break; 
            default:  
                     System.out.println("Número não é 1, 2 ou 3.");
                break;  
        
}    
}
}
