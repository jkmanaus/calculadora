/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcalculadorafracao;
import javax.swing.JOptionPane;
/**
*
* @author john
*/
class PrincipalCalculadora {
    public static void main( String args[] ){
        int x, y;
        String sX, sY;
        sX = JOptionPane.showInputDialog( null, "Digite o primeiro número:","Primeiro número", JOptionPane.QUESTION_MESSAGE );
        x = Integer.parseInt( sX );
        sY = JOptionPane.showInputDialog( null, "Digite o segundo número:",
        "Segundo número", JOptionPane.QUESTION_MESSAGE );
        y = Integer.parseInt( sY );
        // instanciação de um objeto da classe calculadora
        PCalculadora calc = new PCalculadora();
        JOptionPane.showMessageDialog(null, "somar: " + calc.somar( x, y ) );
        JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair( x,y )
        );
        JOptionPane.showMessageDialog(null, "multiplicar: " +
        calc.multiplicar(x, y ) );
        JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir( x,y ) );

        System.exit( 0 );
    }
}
