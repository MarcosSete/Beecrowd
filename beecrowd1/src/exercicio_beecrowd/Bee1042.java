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
 Leia 3 valores inteiros e ordene-os em ordem crescente. No final,
 mostre os valores em ordem crescente, uma linha em branco e em
 seguida, os valores na sequência como foram lidos.

 ENTRADA
 A entrada contem três números inteiros.

 SAÍDA
 Imprima a saída conforme foi especificado.
 */

import java.util.Scanner;
public class Bee1042 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        if (A < B && A < C) {
            System.out.println(A);
            if (B < C) {
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }
        } else if (B < C) {
            System.out.println(B);
            if (A < C) {
                System.out.println(A);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(A);
            }
        } else {
            System.out.println(C);
            if (A < B) {
                System.out.println(A);
                System.out.println(B);
            } else {
                System.out.println(B);
                System.out.println(A);
            }
        }

        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
