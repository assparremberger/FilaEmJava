/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaemjava;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class FilaEmJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = -1;
        int tamanho = Integer.valueOf(
                JOptionPane.showInputDialog("Qual tamanho da fila?")
        );
        Fila fila = new Fila( tamanho );
        
        while ( opcao != 0 ) {       
            String menu =   "1 - Adicionar na fila \n" + 
                            "2 - Retirar da fila \n" +
                            "3 - Imprimir fila \n"+
                            "0 - Sair";
            opcao = Integer.valueOf( JOptionPane.showInputDialog( menu ) );
            switch( opcao ){
                case 1:
                    if( fila.estaCheia() ){
                        JOptionPane.showMessageDialog(null, "Valor não adicionado, pois a fila está cheia");
                    }else{
                        int valor = Integer.valueOf( JOptionPane.showInputDialog( "Digite o valor:") );
                        fila.adicionar(valor);
                    }
                    break;
                case 2:
                    fila.retirar();
                    break;
                case 3: 
                    fila.imprimir();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
    
}
