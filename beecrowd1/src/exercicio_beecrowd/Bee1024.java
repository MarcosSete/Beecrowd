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
Solicitaram para que você construisse um programa simples de criptografia. Este
 programa deve possibilitar enviar mensagens codificadas sem que alguém consiga
 lê-las. O processo é muito simples. São feitas três passadas em todo o texto.

 Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas
 devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a'
 deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente.
 Na segunda passada, a linha deverá ser invertida. Na terceira e última passada,
 todo e qualquer caractere a partir da metade em diante (truncada) devem ser
 deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.

 Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta
 entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte
 os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres
 da metade em diante, o resultado final deve ser “3# rvzgV”.

 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso de teste
 contém um inteiro N (1 <= N <= 1*104), indicando a quantidade de linhas que o
 problema deve tratar. As N linhas contém cada uma delas M (1 <= M <= 1*103) caracteres.

 SAÍDA
 Para cada entrada, deve-se apresentar a mensagem criptografada.

 */

import java.util.Scanner;
public class Bee1024 {
    public static void main(String[] args) {
        // Instanciando o leitor e lendo o número de caso de testes
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        // Percorendo os 'N' Casos de teste
        for (int i = 0; i < N; i++) {

            // Instanciando o StringBuilder para trabalhar mais facilmente a String
            StringBuilder M = new StringBuilder(readLine(leitor));

            // Passanda 1
            for (int j = 0; j < M.length(); j++) {
                int code = M.charAt(j);
                if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                    char c = (char) (code + 3);
                    M.setCharAt(j, c);
                }
            }

            // Passada 2
            M.reverse();

            // Passada 3
            for (int j = M.length() / 2; j < M.length(); j++) {
                char c = (char) (M.charAt(j) - 1);
                M.setCharAt(j, c);
            }

            // Print
            System.out.println(M.toString());
        }
    }

    /*
     * Método para ler a String sem bugs de espaçamentos
     */
    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }
}
