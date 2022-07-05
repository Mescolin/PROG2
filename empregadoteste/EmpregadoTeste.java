import java.util.ArrayList;

class EmpregadoTeste {
    public static void main(String[] args){
        /*
        // letra A
        Empregado empregados[] = new Empregado[2];

        empregados[0] = new Empregado("Joao", "Pedro", 1000);
        empregados[1] = new Empregado("Luis", "Batista", 1100);

        for(Empregado e : empregados){
            e.aumentoSalario(10);
            e.imprimirInfo();
        }

        */

        // letra B

        ArrayList<Empregado> empregados = new ArrayList<>();
        empregados.add(new Empregado("Cleiston", "Silva", 1000));
        empregados.add(new Empregado("Marina", "Ivanov", 2000));
        empregados.add(new Empregado("Luan", "Silva", 2000));

        System.out.println("Tamanho do ArrayList: " + empregados.size());
        Empregado empBuscado = empregados.get(2);
        System.out.println(empBuscado.getNome());

        Empregado test = new Empregado("Teste", "", 1000);
        if(empregados.contains(test)){
            System.out.println(empBuscado.getNome() + " existe!");
        }
        else{
            System.out.println("Empregado nao encontrado!");
        }

        empregados.add(0, test);

        System.out.println(empregados.get(0).getNome());

        for(Empregado e : empregados){
            e.aumentoSalario(10);
            e.imprimirInfo();
        }
    }
}