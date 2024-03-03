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
 Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada
 de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele
 pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for
 NULA (nesta situação sem escrever mensagem alguma).

 ENTRADA
 A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

 SAÍDA
 Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a
 coordenada lida, conforme o exemplo.
 */

import java.util.Scanner;
public class Bee1115 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();
        while (X != 0 && Y != 0) {
            if (X == 0 || Y == 0) break;
            else if (Y > 0 && X > 0) System.out.println("primeiro");
            else if (Y > 0 && X < 0) System.out.println("segundo");
            else if (Y < 0 && X < 0) System.out.println("terceiro");
            else if (Y < 0 && X > 0) System.out.println("quarto");
            X = leitor.nextInt();
            Y = leitor.nextInt();
        }
    }
}
