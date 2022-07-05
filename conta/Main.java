package conta;

public class Main {
    public static void main(String[] args){
        Conta contas[] = new Conta[5];

        contas[0] = new ContaDeAgua("A", "B", 2, 3);
        contas[1] = new ContaDeAgua("A", "B", 2, 3);
        contas[2] = new ContaDeLuz("L", "B", 2, 5);
        contas[3] = new ContaDeAgua("A", "B", 7, 3);
        contas[4] = new ContaDeLuz("L", "B", 2, 6);

        for(Conta c : contas){
            System.out.println(c.toString());
            c.calcularTotal();
        }
    }
}
