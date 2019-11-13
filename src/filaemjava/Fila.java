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
public class Fila {
    
    // Vetor para armazenar os valores enfileirados
    private int[] array;
    
    // Atributo que guarda a posição no array onde está o fim da fila
    private int fim;
    
    // Atributo para guardar o tamanho do array
    private int tamanho;
    
    public Fila(int tamanho){
        
        // Inicialização do array com o tamanho recebido por parâmetro
        array = new int[tamanho];
        
        // Como o Zero é uma posição válida no array, então colocamos um valor
        // não válido para sinalizar que a fila está vazia
        fim = -1;
        
        this.tamanho = tamanho;
    }
    
    public void adicionar(int valor){
        if( fim == tamanho - 1){
            JOptionPane.showMessageDialog(null, "Valor não adicionado, pois a fila está cheia");
        }else{
            fim ++;
            array[fim] = valor;
            imprimir();
        }
    }
    
    public void retirar(){
        if( fim == -1 ){
            JOptionPane.showMessageDialog(null, "A fila já está vazia");
        }else{
            
            // laço para organizar a fila
            for(int i = 0; i<fim; i++){
                array[i] = array[i+1];
            }
            
            fim --;
            
            imprimir();
        }
    }
    
    public void imprimir(){
        if( fim == -1 ){
            JOptionPane.showMessageDialog(null, "A fila está vazia");
        }else{
            String texto = "";
            for(int i = 0 ; i <= fim; i++){
                texto += "Posição " + (i+1)+ ": " + array[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
    }
    
    public boolean estaCheia(){
        if( fim == tamanho - 1){
            return true;
        }else{
            return false;
        }
    }
}
