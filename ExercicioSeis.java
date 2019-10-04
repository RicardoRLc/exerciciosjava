
public class ExercicioSeis {
   public static void main(String[] args) {
               /*
        Crie um programa que de a soma de todos os números ímpares e
        múltiplos de 7 entre 1 e 500.
        */
        int i = 7;
        int soma = 0;
            for (i = 7; i <= 500; i++){                              
                if (i % 7 == 0) {
                soma=soma+i;
                }
            }
        System.out.println("A Soma dos Multiplos de 7 é: " + soma + "\n");        
    }
}      



