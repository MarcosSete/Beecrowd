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
 Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
 dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
 este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,
 deverá ser impressa a mensagem “Fora de intervalo”.

 O símbolo ( representa "maior que". Por exemplo:
 [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
 (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

 ENTRADA
 O arquivo de entrada contém um número com ponto flutuante qualquer.

 SAÍDA
 A saída deve ser uma mensagem conforme exemplo abaixo.
 */

import java.util.Scanner;
public class Bee1037 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");}

    }
}
