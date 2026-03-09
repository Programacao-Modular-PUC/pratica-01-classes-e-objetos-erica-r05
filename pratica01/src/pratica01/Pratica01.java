
package pratica01;
import java.util.Scanner;

public class Pratica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do cateto 1: ");
        double cat1 = sc.nextDouble();
        System.out.println("Digite o valor do cateto 2: ");
        double cat2 = sc.nextDouble();
        TrianguloRetagulo triangulo = new TrianguloRetagulo(cat1,cat2);
        System.out.println("O valor da area desse triangulo e: " + triangulo.calcularArea(cat1, cat2));
        System.out.println("O valor da hipoenusa desse triangulo e: " + triangulo.calculaHipotenusa(cat1, cat2));
        sc.close();
    }
    
}
