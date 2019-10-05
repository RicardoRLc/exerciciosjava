import java.io.*;

public class Exemplo01 {

    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(ler.txt);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
    }
}
     


// onde esta lista não terá uma determinação de quantidade fixa, podendo variar
// de arquivo para arquivo.

// Após, deverá ser alocado os valores dentro da estrutura de Array (não poderão
// ser aplicadas Collections para solução),

// e realizada a ordenção dos valores,

// imprimindo em tela os passos ocorridos desta ordenação.

// Após, deverá ser utilizado uma Collection para o recebimento dos mesmos
// valores, de maneira que estes valores já estejam ordenados.

// Ao final, deverá ser impresso em tela o valor ordenado do Array e da
// Collection, garantindo que estejam iguais,

// e deverá ser exportado em um arquivo de texto esses valores.

// FUP leia 20 valores, calcule a media aritimetica desses valores e imprime os
// valores que são menores que a media.