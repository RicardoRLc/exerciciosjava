public class PC {
    String modelo;
    int nucleo;
    int memoria;
    boolean tipo;
      
    void tela(){
        System.out.println("Modelo: "+modelo+" Quantidades de Núcleos: "+nucleo+" memória RAM: "+memoria+"");
    }

    int ligar(){
        this.memoria--;
        return this.memoria;
    } 
    int desligar(){
        this.memoria++;
        return this.memoria;

    }
    int instalar(){
        this.nucleo -- ;
        return this.nucleo;

    } 
}

