
package pratica01;


public class TrianguloRetagulo {
    private double c1;
    private double c2;
    private double h;
    private double area;
    
    public TrianguloRetagulo(){
        
    }
    public TrianguloRetagulo(double c1, double c2){
        this.c1 = c1;
        this.c2 = c2;
    
        
    }
    public double getC1(){
        return c1;
    }
    public void setC1(Double c1){
        this.c1 = c1;
    }
    public double getC2(){
        return c2;
    }
    public void setC2(Double c2){
        this.c2 = c2;
    }
    public double getH(){
        return h;
    }
    public void setH(Double h){
        this.h = h;
    }
    public double getArea(){
        return area;
    }
    public void setArea(Double area){
        this.area = area;
    }
    public double calculaHipotenusa(double c1, double c2){
        return h = Math.sqrt(c1+c2);
    }
    public double calcularArea(double c1, double c2){
        area = (c2*c1)/2;
        return area;
    }
    
}
