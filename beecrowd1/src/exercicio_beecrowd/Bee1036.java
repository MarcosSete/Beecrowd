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
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação
 de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem
 correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
 numero negativo.

 ENTRADA
 Leia três valores de ponto flutuante (double) A, B e C.

 SAÍDA
 Se não houver possibilidade de calcular as raízes, apresente a mensagem
 "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
 Imprima sempre o final de linha após cada mensagem.
 */

import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        if ((A == 0) | (B * B - 4 * A * C < 0)) {
            System.out.println("Impossivel calcular");
            return;
        }

        double bascara = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
}
