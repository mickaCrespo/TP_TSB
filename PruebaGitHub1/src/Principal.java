import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        float a = scanner.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        float b = scanner.nextFloat();
       
        Aritmetica A = new Aritmetica(a,b);
        System.out.println("La suma de los numeros es "+ A.suma());
        System.out.println("La resta de los numeros es "+ A.resta());
        System.out.println("El producto de los numeros es "+ A.multiplicacion());
        System.out.println("El cociente de los numeros es "+ A.division());
    }
    
}
