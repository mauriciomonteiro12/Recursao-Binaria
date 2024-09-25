public class Main {

    public static void main(String[] args) {
        RecursaoBinaria recursaoBinaria  = new RecursaoBinaria();
        Fibonacci fibonacci = new Fibonacci(recursaoBinaria);

        int numero = 10;
        int resultado = fibonacci.calcularFibonacci(numero);
        System.out.println("O Fibonacci de " + numero + " é: " + resultado);
    }
}