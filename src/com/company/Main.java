package com.company;

import javax.swing.*;

public class Main {
    //Variables que necesitamos para el menu.
    static int option;
    static String menu;

   public static void main(String[] args) {
       //Primero hare un objeto de la clase OperacionesBasicas
       OperacionesBasicas object = new OperacionesBasicas();
       //Y creare un menu para mas organizacion y poder hacer operaciones cuantas veces quiera. Hasta seleccionar opción salir.
       //Creare un do while.
       do {
           menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1. Suma\n" + "2. Resta\n" + "3. División\n" + "4 Multiplicación\n" + "5. Salir");
           option = Integer.parseInt(menu);
           //Creamos el menu.
           switch (option){
               case 1:
                   object.suma();
                   break;
               case 2:
                   object.resta();
                   break;
               case 3:
                   object.division();
                   break;
               case 4:
                   object.multiplicacion();
                   break;
               case 5:
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "La opción " + option + " es incorrecta");
           }

       }while(option != 5);
    }
}
