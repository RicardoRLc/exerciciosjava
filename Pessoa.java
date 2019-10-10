public class Pessoa {
    
    String nome;
    int peso;
    float altura;
    String dnascimento; 
    
    double calculoimc(){
        return peso / (altura*altura)
    }
    
 
}
