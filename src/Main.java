import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número para verificar se pertence a sequência de Fibonacci:");

        int num = sc.nextInt();

        if (verificarFibonacci(num)) {
            System.out.println(num + " pertence a sequência de Fibonacci");
        } else {
            System.out.println(num + " NÃO pertence a sequência de Fibonacci");
        }

        sc.close();
    }

    public static boolean verificarFibonacci(int num) {
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; n1 <= num; i++) {
            if (n1 == num) {
                return true;
            }
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
        return false;
    }
}