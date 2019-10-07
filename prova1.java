import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class prova1 {
    public static void main(String[] args){
         //Recebe o valores de uma lista
        int i;
        try{
            BufferedReader ler = new BufferedReader(new FileReader("ler.txt"));
            BufferedWriter salvo = new BufferedWriter(new FileWriter("salvo.txt"));
            // Após, deverá ser alocado os valores dentro da estrutura de Array )
            String[] array = ler.readLine().split(",");
            int[] valor = new int[array.length];
            //conversao de int e String e salvando  
            for(i=0; i<array.length; i++){
                valor[i] = Integer.parseInt(array[i]);
            }
            ler.close();
            //Hora de ordenar
            int aux = 0;
            for(i = 0; i<valor.length; i++){
                //Primeiro numero a selecionar
                for(int j = 0; j<(valor.length-1); j++){
                    if(valor[j] > valor[j + 1]){
                        //faz verificação se o primeiro numero é maior
                        aux = valor[j];
                        //salva o maior numero
                        valor[j] = valor[j+1];
                        // O primeiro numero vai receber o maior
                        valor[j+1] = aux;
                        //o segundo reebendo o valor do primeiro
                    }
            // passo a passo da ordenação .  
                }
                System.out.println(Arrays.toString(valor));
            }
            // Recebe um colleciton para os valores apos já ordenados.
            ArrayList<Integer> list = new ArrayList<>();
            for(i = 0; i<valor.length; i++){
                list.add(valor[i]);
            }
            // Imprimindo os valores do arrays e collection ,
            System.out.println("Vetor:");
            System.out.println(Arrays.toString(valor));
            System.out.println(" array ");
            for (i=0; i<valor.length; i++){
                System.out.print(valor[i] + "; ");
                //Valores mostrados.
                salvo.append(", "+valor[i]);
            }
            salvo.close();
        }catch (IOException exception){
            System.out.println("Erro I/O: " + exception.getMessage());
        }
    }
}