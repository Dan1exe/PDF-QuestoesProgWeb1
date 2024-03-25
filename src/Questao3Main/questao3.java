package Questao3Main;


import java.text.DecimalFormat;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
       
        //Variaveis
        double x;
        double y;
        double z;
        
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite a Primeira nota: ");
            x = scanner.nextDouble();
            System.out.println("Digite a Segunda nota: ");
            y = scanner.nextDouble();
            System.out.println("Digite a Terceira nota: ");
            z = scanner.nextDouble();
            scanner.close();
        double resultado = (x + y + z)/3;
         
            DecimalFormat df = new DecimalFormat("#.##");
            String resultadoFormatado = df.format(resultado);
            System.out.println("A media das notas e: " + resultadoFormatado);
        }
    }
}
