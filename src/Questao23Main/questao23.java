/*
 * Calculadora básica. Faça um programa na linguagem Java que, recebidos pelo teclado dois valores
numéricos e a operação desejada (soma, subtração, multiplicação ou divisão) mostre, no console, o
resultado do cálculo.
 */
package Questao23Main;
import java.util.Scanner;

public class questao23 {
        public static void main(String[] args) {
            
            float x;
            float y;
            float resultado;
            String operacao;
            String ctnr = "S";
            Scanner scanner = new Scanner(System.in);
        while( "S".equals(ctnr)){
            
            
                System.out.println("Digite um numero: ");
                x = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Voce deseja usar qual operacao? (+, -, *, /)");
                operacao = scanner.nextLine();
                System.out.println("Digite outro numero: ");
                y = scanner.nextFloat();
                scanner.nextLine();
                
                
                switch  (operacao){
                    case "+":
                        resultado = x+y;
                        System.out.println("O resultado e: " + resultado);
                        break;
                    case "-":
                        resultado = x-y;
                        System.out.println("O resultado e: " + resultado);
                        break;
                    case "*":
                        resultado = x*y;
                        System.out.println("O resultado e: " + resultado);
                        break;
                    case "/":
                        if(y != 0){
                        resultado = x/y;
                        System.out.println("O resultado e: " + resultado);
                        }else{
                            System.out.println("Operacao Invalida");
                        }
                        break;
                    default:
                        System.out.println("Use somente numeros e os parametros (+, -, *, /)");
                        break;
                }
                System.out.println("Quer fazer outra operacao?[S/N]");
                ctnr = scanner.nextLine().toUpperCase();
                
            }
            scanner.close();
        }            
    }
