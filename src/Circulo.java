import java.util.Scanner;

public class Circulo extends Figura {
double radio;
    @Override
    public double calcularPerimetro() {
        double perimetro= 2*Math.PI*radio;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    public void ingresarRadio(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
    }
}
