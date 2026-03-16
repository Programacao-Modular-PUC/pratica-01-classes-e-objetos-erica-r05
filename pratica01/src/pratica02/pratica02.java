/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author 1632233
 */
public class pratica02 {
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("digite o nome");
        String nome = sc.nextLine();
        System.out.println("digite o sobrenome");
        String sobrenome = sc.nextLine();
        System.out.println("digite a idade");
        int idade = sc.nextInt();
        System.out.println("digite a altura");
        double altura = sc.nextDouble();
        System.out.println("digite o peso");
        double peso = sc.nextDouble();
        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);
        p.InformaObesidadde( p.CalculaIMC(peso, altura));

    }    
}
