package exercicio_beecrowd;
/*
MIT License

Copyright (c) 2024 Marcos G. S. C. Sete

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

/**
 *
 * @author Marcos Gabriel Soares Cruz  <marcossetecruzsoares@gmail.com>
 */


/*
 QUESTÃO
 Na matemática, um número perfeito é um número inteiro para o qual a soma de
 todos os seus divisores positivos próprios (excluindo ele mesmo) é igual
 ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
 Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não.

 ENTRADA
 A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro
 N (1 <= N <= 20), indicando o número de casos de teste da entrada. Cada uma das N linhas
 seguintes contém um valor inteiro X (1 <= X <= 108), que pode ser ou não, um número perfeito.

 SAÍDA
 Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”,
 de acordo com a especificação fornecida.
 */
import java.util.Scanner;

public class Bee1164 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, soma;
        for (int i = 0; i < N; i++) {
            soma = 0;
            X = leitor.nextInt();
            for (int j = 1; j < X; j++) {
                if (X % j == 0) soma += j;
            }
            if (soma == X) System.out.println(X + " eh perfeito");
            else System.out.println(X + " nao eh perfeito");
        }
    }
}
