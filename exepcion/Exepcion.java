package exepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcion {

    public static void main(String[] args){
        /* 
            Escreva um programa para preencher valores de um 
            vetor de inteiros com 10 posições. O usuário irá 
            informar os valores a serem inseridos e suas 
            respectivas posições no array. O programa deve tratar 
            as exceções ArrayIndexOutOfBoundsException quando 
            for informada uma posição inexistente do vetor e 
            InputMismatchException quando o valor informado não 
            for numero.
        
            Jeito do Cleiston
        */
        int vetor[] = new int[10];
        int valor, pos;
        Scanner entrada = new Scanner(System.in);

        boolean continua = true;
        while(continua){
            try{
                valor = entrada.nextInt();
                pos = entrada.nextInt();
                vetor[pos] = valor;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição inválida do vetor!");
            }
            catch (InputMismatchException e){
                System.out.println("Entrada inválida!");
                entrada.next();
            }
        }
    }
}
 /*

Feito em aula, meu jeito:

public class Array {

    public static void main(String[] args) {

        int[] vet = new int[10];
        
        System.out.println("Entre com os numeros para o vetor vet");
        
        try(Scanner ler = new Scanner(System.in)) {
            try{
                for(int cont=0;cont<vet.length;cont++){
                    vet[cont]=ler.nextInt();
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição inexistente do vetor " + e);
            }
            catch(NumberFormatException e) {
                System.out.println("O valor informaod não é um número " + e);
            }
            catch(InputMismatchException e){
                System.out.println("O valor informado não é um número" + e);
            }
            System.out.println("Fim da entrada de dados para o vetor");
        }
    }
*/