/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package receba.project;

/**
 *
 * @author 53795760879
 */


/**
 *
 * @author 53795760879
 */
import java.util.Scanner;
public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 1 numero: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite 2 numero: ");
        int numero2 = sc.nextInt();
        
        if (numero1 >= numero2){
            System.out.println("Forte");
        }else{
            System.out.println("Fraco");
        }
        
 
        
    }
    
    /* if (condição -- > < == != >= <=)
       BLOCO DE COMANDOS
       if (variavel !=, ==, >, <, etc variavel)
       BLOCO DE COMANDOS */



}
