package com.company;

import javax.swing.*;

public class OperacionesBasicas {
    //Creamos las variables que necesitaremos.
    double number1;
    double number2;
    double resultado;

    //Luego haremos el constructor de la clase OperacionesBasicas
    public OperacionesBasicas(){
        number1 = 0;
        number2 = 0;
        resultado = 0;
    }
    //Creamos los metodos que utilizaremos (suma, resta, división y multiplicación)
    public void suma(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = number1 + number2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    //Copiare y pegare el mismo metodo cambiandole su nombre y el signo de operación.
    public void resta(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = number1 - number2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    public void division(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = number1 / number2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    public void multiplicacion(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = number1 * number2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    //Ya están creados los metodos que utilizaremos.
    //Con eso ya podemos hacer operaciones con decimales.
}
