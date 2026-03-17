/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica02;

import java.util.Calendar;
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

    public Data getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public int calculaIdade(){
        Calendar hoje = Calendar.getInstance();

        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - data_nascimento.getAno();

        if (mesAtual < data_nascimento.getMes() ||
                (mesAtual == data_nascimento.getMes() && diaAtual < data_nascimento.getDia())) {
            idade--;
        }

        return idade;
    }
    public double CalculaIMC(double peso, double altura){
        imc = peso/Math.pow(altura, 2);
        return imc;
    }
    public String InformaObesidade(double imc){
        if (imc < 18.5){
            return "Abaixo do peso";
        }
        else if (imc <= 24.9){
            return "Peso normal";
        }
        else if (imc <= 29.9){
            return "Sobrepeso";
        }
        else if (imc <= 34.9){
            return "Obesidade grau 1";
        }
        else if (imc <= 39.9){
            return "Obesidade grau 2";
        }
        else{
            return "Obesidade grau 3";
        }
    }
}
