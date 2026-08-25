/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package receba.project;

/**
 *
 * @author 53795760879
 */
import java.util.Scanner;
public class Project {

    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        int idade = 10;
        System.out.println(idade > 10);
        
        String senha = "Minhasenha";
        System.out.println("Amor" != senha);
        
        System.out.println("Digite a senha: ");
        String palavra = ds.nextLine();
       
        if (!palavra.equals(senha)){
        System.out.println("Usuario ou senha incorreto!!!");
        }else{
            System.out.println("Senha correta");
        }
        
        
        
    }
    
    /* if (condição -- > < == != >= <=)
       BLOCO DE COMANDOS
       if (variavel !=, ==, >, <, etc variavel)
       BLOCO DE COMANDOS */

}
