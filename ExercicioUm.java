package exerciciosdois;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Kadu Floresta");
        /*
        Exercicio1 - MEDIA DE 3 NOTAS
        1) Crie um programa que receba três notas calcule a média e diga se foi aprovado
        (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
        */
        
        int nota1, nota2, nota3, media1; //Valor da Variável
        
        System.out.println("Digite a 1ª Nota: ");
        nota1 = ent.nextInt();
        
        System.out.println("Digite a 2ª Nota: ");
        nota2 = ent.nextInt();
        
        System.out.println("Digite a 3ª Nota: ");
        nota3 = ent.nextInt();
        
        media1 = ((nota1 + nota2 + nota3) / 3);   	
        if (media1 >= 7) { //Maior ou Igual ao Resultado 21
            System.out.println("===============");
            System.out.println(" ALUNO APROVADO!");
            System.out.println(" ===============");
        } else if(media1 >= 5) { //Menor ou Igual ao Resultado 20
            System.out.println("==================");
            System.out.println(" ALUNO RECUPERAÇÃO!");
            System.out.println(" ==================");
        } else { //Caso Contrário 
            System.out.println("================");
            System.out.println(" ALUNO REPROVADO!");
            System.out.println("================");
        }
        
        ent.close();
    }

}

