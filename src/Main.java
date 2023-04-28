import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FormulaGeneral formula = new FormulaGeneral();
        Scanner scanner = new Scanner(System.in);
        int opc=1;
        while (opc!=0){
            formula.operacion(scanner);
            System.out.println("0 para salir o cualquier numero para continuar:");
            opc=scanner.nextInt();
        }
    }
}
