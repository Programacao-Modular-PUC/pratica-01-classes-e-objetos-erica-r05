/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica02;
import java.util.Date;
/**
 *
 * @author 1632233
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private Data data_nascimento;
    
    public Pessoa(){
        
    }
    public Pessoa(String nome, String sobrenome, int idade, double altura,double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    public int calculaIdade(){
        Calendar c = Calendar.getInstance();
        
    }
    public double CalculaIMC(double peso, double altura){
        imc = peso/Math.pow(altura, 2);
        return imc;
    }
    public void InformaObesidadde(double imc){
        if (imc < 18.5){
            System.out.println("Apaixo do peso");
        }
        else{
            if(18.5<imc && imc<=24.9){
                System.out.println("Peso normal");
            }
            else{
                if(25<=imc && imc <=29.9){
                    System.out.println("Sobrepeso");
                }
                else{
                    if(30<=imc && imc <=34.9){
                        System.out.println("Obesidade grau 1");
                    }
                    else{
                         if(35<=imc && imc <=39.9){
                        System.out.println("Obesidade grau 2");
                        }
                         else{
                             System.out.println("Obesidade grau 3");
                         }
                    }
                }
            }
        }
    }
}
