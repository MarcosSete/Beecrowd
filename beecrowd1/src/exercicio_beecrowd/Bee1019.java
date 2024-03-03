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
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

        ENTRADA
O arquivo de entrada contém um valor inteiro N.

        SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

 */

import java.util.Scanner;
public class Bee1019 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int duracaoSegundos = leitor.nextInt();
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;
        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;
        int segundos = duracaoSegundos;
        System.out.println(horas + ":" + minutos + ":" + segundos);


    }
}
