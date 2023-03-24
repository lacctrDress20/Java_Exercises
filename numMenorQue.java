import java.util.Scanner;

public class numMenorQue { 
    public static void main(string[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        double numero = num1.nextDouble();
        Scanner num2 = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        double numero2 = num2.nextDouble();
        if(numero != numero2){
            System.out.println("El numero"+numero "es diferente a"+numero2);
        }if(numero <= numero2){
            System.ou.println("El numero"+ numero "es menor que"+numero2);
        }if(numero >= numero2){
            System.out.println("El numero"+numero "es menor o igual que"+numero2)
        }

    
    }
}    