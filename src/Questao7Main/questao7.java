package Questao7Main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao7 {
        public static void main(String[] args) {
            int n ;
            int contador = 0;
            float notas;
            float somadorDeNotas=0;
            float media;
            try (Scanner scanner = new Scanner(System.in)){
                System.out.println("Digite a quantidade de notas: ");
                n = scanner.nextInt();


                while(contador < n){

                    System.out.println("Digite a nota: ");
                    notas = scanner.nextFloat();
                    somadorDeNotas = somadorDeNotas + notas;
                    contador ++;
                    
                    scanner.close();

                }
            }
            media = somadorDeNotas/n;
            DecimalFormat df = new DecimalFormat("#.##");
            String mediaFormatada = df.format(media);
            
            System.out.println("A media e: " + mediaFormatada);
        }
        
}

