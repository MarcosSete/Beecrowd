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
A corrida de lesmas é um esporte que cresceu muito nos últimos anos, fazendo
com que várias pessoas dediquem suas vidas tentando capturar lesmas velozes,
e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de
capturar lesmas velozes não é uma tarefa muito fácil, pois praticamente todas
as lesmas são muito lentas. Cada lesma é classificada em um nível dependendo
de sua velocidade:

Nível 1: Se a velocidade é menor que 10 cm/h .
        Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
        Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

Sua tarefa é identificar qual nível de velocidade da lesma mais veloz de um
grupo de lesmas.

        ENTRADA
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas
linhas: A primeira linha contém um inteiro L (1 <= L <= 500) representando o
número de lesmas do grupo, e a segunda linha contém L inteiros Vi (1 <= Vi <= 50)
representando as velocidades de cada lesma do grupo.

A entrada termina com o fim do arquivo (EOF).

SAÍDA
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade
da lesma mais veloz do grupo.

 */


import java.util.Scanner;
public class Bee1789 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int L, nivel, velocidade;

        while (leitor.hasNext()) {
            L = leitor.nextInt();
            nivel = 0;
            for (int i = 0; i < L; i++) {
                velocidade = leitor.nextInt();
                if (velocidade < 10 && nivel <= 1)  nivel = 1;
                else if (velocidade >= 20 && nivel <= 3) nivel = 3;
                else if (nivel < 2) nivel = 2;
            }
            System.out.println(nivel);
        }

    }
}
