
package limitevetor;

class LimiteVetorException extends Exception {
    public LimiteVetorException(){
        super("Você está ultrapassando o limite do vetor!");
    }
}