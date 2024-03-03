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
Leia 2 valores com uma casa decimal (x e y), que devem representar
 as coordenadas de um ponto em um plano. A seguir, determine qual o
 quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
 cartesianos ou na origem (x = y = 0).
 Se o ponto estiver na origem, escreva a mensagem “Origem”.
 Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

 ENTRADA
 A entrada contem as coordenadas de um ponto.

 SAÍDA
 A saída deve apresentar o quadrante em que o ponto se encontra.


 */
import java.util.Scanner;
public class Bee1041 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (y > 0 && x > 0) {
            System.out.println("Q1");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (y < 0 && x > 0) {
            System.out.println("Q4");
        }
    }
}
