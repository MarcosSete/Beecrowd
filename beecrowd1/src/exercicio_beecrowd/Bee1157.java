package exercicio_beecrowd;
/*
 QUESTÃO
 Ler um número inteiro N e calcular todos os seus divisores.

 ENTRADA
 O arquivo de entrada contém um valor inteiro.

 SAÍDA
 Escreva todos os divisores positivos de N, um valor por linha.
 */
import java.util.Scanner;
public class Bee1157 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) System.out.println(i);
        }
    }
}
