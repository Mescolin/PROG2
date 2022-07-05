class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    Empregado (String nome, String sobrenome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.sobrenome = sobrenome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentoSalario(double aumento){
        setSalario(this.salario * (aumento / 100.0) + this.salario);
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.printf("Salario: R$ %.2f\n", this.salario);
    }
}