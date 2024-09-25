public class Fibonacci {

    public RecursaoBinaria recursao;

    public Fibonacci(RecursaoBinaria recursao) {
        this.recursao = recursao;
    }

    public int calcularFibonacci(int n) {
        return recursao.calcularFibonacci(n);
    }
}
