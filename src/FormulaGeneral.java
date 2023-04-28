import java.util.Scanner;

public class FormulaGeneral {
    int a;
    int b;
    int c;
    int d;
    public void operacion(Scanner scanner){
        System.out.println("Ingresa A");
        a=scanner.nextInt();
        System.out.println("Ingresa B");
        b=scanner.nextInt();
        System.out.println("Ingresa C");
        c=scanner.nextInt();
        d= b*b-4*a*c;
        if(d>0){
            System.out.println("la ecuación cuadrática tiene dos soluciones diferentes");
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d==0) {
            System.out.println("la ecuación cuadrática tiene una única solución real");
            double x1 = -b/(2*a);
            System.out.println("x1 = " + x1);
        }else{
            System.out.println("entonces la ecuación cuadrática no tiene soluciones reales");

        }
    }
}
