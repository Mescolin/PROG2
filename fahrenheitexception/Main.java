package fahrenheitexception;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = entrada.nextDouble();

        try {
            double tempC = Utils.toCelsius(tempF);
            System.out.println("Temperatura em Fahrenheit: " + tempC);
        }
        catch(FahrenheitException e){
            System.out.println("Erro 1");
        }
        catch(Exception e){
            System.out.println("Erro 2");
        }
    }
}
