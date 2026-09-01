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
public class EX03 {
    public static void main (String[] args){
    Scanner dc = new Scanner(System.in);
    
    System.out.println("Digite o valor do saque em: ");
    int saque = dc.nextInt();
    
    if(saque < 10 || saque > 600){
        System.out.println("Valor deve ser entre 10 e 600 reais");
    }else{
        int restante = saque;
        
        int notas100 = restante/100;           /*347/100 = 3 (Supondo que o numero que ele queria sacar seja 347 das notas que temos)*/
        restante = restante % 100;             /*47/100 47*/
        
        int notas50 = restante/50;
        restante = restante % 50;
        
        int notas10 = restante/10;
        restante = restante % 10;
        
        int notas5 = restante/5;
        restante = restante % 5;
        
        int notas1 = restante;
        
        System.out.println("-----------Notas Fornecidas----------");
        System.out.println("Notas de 100 = "+ notas100);
        System.out.println("Notas de 50 = "+ notas50);
        System.out.println("Notas de 10 = "+ notas10);
        System.out.println("Notas de 5 = "+ notas5);
        System.out.println("Notas de 1 = "+ notas1);
        
        
    }
    
    
    
    
    }
}
