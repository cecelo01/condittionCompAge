/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.condicaocompostaidade;
import java.util.Scanner;
/**
 *
 * @author Marce
 */
public class CondicaoCompostaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nasc = entrada.nextInt();
        
        int idad = 2022 - nasc;
        
        //String res = (idad >= 18) ? "Maior de idade" : "Menor de Idade";
        //System.out.println(idad +" anos. "+ res);
        
        if (idad < 16){
            System.out.println("Nao vota." + idad);
        }else if ((idad >= 16 && idad < 18) || (idad > 70)){
            System.out.println("Voto Opcional"+ idad);
        }else{
            System.out.println("Voto Obrigatorio"+ idad);
        }
    }
        
}
       
