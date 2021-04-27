package pcalculadorafracao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import pcalculadorafracao.PCalculadora;
/**
*
* @author john
*/
public class TesteCalculadora {
    public static void main(String[] a){
        PCalculadora c = new PCalculadora();
            int valorUm = 5;
            int valorDois = 5;
            double valorTotal = c.somar(valorUm, valorDois);
            if(valorTotal == 10){
                System.out.println("valor correto!");
            }else{
                System.out.println("valor errado!");
        }
    }
}
