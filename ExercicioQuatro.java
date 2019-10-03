//package exerciciosdois;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
    Scanner ent4 = new Scanner(System.in);
            /*
        Exercicio4 - TABUADA SELECT
        4) Crie um programa que imprima a tabuada de 0 a 10.
        */
    
    int Num; //Valor da Variável
    int inicio, fim;
    
    System.out.println("Informe a Tabuada: ");
    Num = ent4.nextInt();    
    System.out.println("Informe o inicio da tabuada: ");
    inicio = ent4.nextInt();    
    System.out.println("Informe o fim da tabuada: ");
    fim = ent4.nextInt();
        
        for (int i = inicio; i <= fim; i++) {
            System.out.println(" " + Num + " x " + i + " = " + Num * i);
        }    
        ent4.close();
    }

}

