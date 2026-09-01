/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receba.project;

/**
 *
 * @author 53795760879
 */
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um caractere: ");
        char caracter = sc.next().charAt(0);
        /*sc.nextLine() => "olá mundo"
          sc.next() => "olá Mundo!!!" = Olá (Oque o sc.next pega a palavra até o espaço
          charAt (numero) => Posição exata do caracter dentro da palavra, ele procura a palavra
          CASA => C = 0, A = 1, S = 2, A = 3 charAt(2) ==> S
          Character.isDigit(variavel)= verifica se a váriavel é um numero
        */
       if (Character.isDigit(caracter)){
         System.out.println("Caractere eh um numero. ");
    }else{
           char cMaiusculo = Character.toUpperCase(caracter);
           
           if (cMaiusculo == 'A'||
               cMaiusculo == 'E'||
               cMaiusculo == 'I'||
               cMaiusculo == 'O'||
               cMaiusculo == 'U'){
               System.out.println("Caractere eh voga!!");
           }else{
               System.out.println("");
           }
       }
       
        
    
        
        
    }
}
