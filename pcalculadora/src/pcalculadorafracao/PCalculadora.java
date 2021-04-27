/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcalculadorafracao;

/**
*
* @author john
*/
public class PCalculadora {
    // atributo
    private int resultado = 0;

    // método somar
    public double somar( int a, int b ){
        resultado = a + b;
        return resultado;
    }
    // método subtrair
    public double subtrair( int a, int b ){
        resultado = a - b;
        return resultado;
    }
    // método multiplicar
    public double multiplicar( int a, int b ){
        resultado = a * b;
        return resultado;
    }
    // método dividir
    public double dividir( int a, int b ){
        resultado = a / b;
        return resultado;
    }
}