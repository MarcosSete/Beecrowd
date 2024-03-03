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
 Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C
 e se D for maior do que A, e a soma de C com D for maior que a soma
 de A e B e se C e D, ambos, forem positivos e se a variável A for par
 escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

 ENTRADA
 Quatro números inteiros A, B, C e D.

 SAÍDA
 Mostre a respectiva mensagem após a validação dos valores.

*/

import java.util.Scanner;
public class Bee1035 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }


    }
}
