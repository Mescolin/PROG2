package limitevetor;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        while(true){
            int indice = entrada.nextInt();
            try {
                if(indice > 10 || indice < 0){
                    throw new LimiteVetorException();
                }
                System.out.println("Ocorreu tudo bem!");
            }catch(LimiteVetorException e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Sempre vou entrar aqui!");
            }
        }
    }
}