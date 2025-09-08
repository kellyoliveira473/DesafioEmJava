import java.util.List;

public class Animal {
      private String tipoAnimal;
     private String nome;
    private List<String> briquedos;


    public Animal() {
    }

    public Animal(String tipoAnimal, String nome, List<String> briquedos) {
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.briquedos = briquedos;
    }
    public String PodeAdota(Pessoa pessoa,Animal animal){
    List<String>brinquedosPessoa1=pessoa.getBriquedos();
    List<String>brinquedosAnimal=animal.getBriquedos();
     if(animal.getNome().equalsIgnoreCase("Loco")){
         return animal.getNome()+"Pessoa"+pessoa.getNumero;

     }
     int numero =0;
     for(String brinquedosAnimal:brinquedosAnimal){
         boolean adotado=false;
         while (numero<brinquedoPessoa.size()){
             if (brinquedosPessoa.get(numero.equalsIgnoreCase(brinquedosAnimal){
                 adotado=true;
                 numero++;
                 break;
             }
             numero++;
         }
         if (!adotado){
         return animal.getNome()+"Abrido"
         }

     }
     return animal.getNome()+"Pessoa"+getNumero();
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getBriquedos() {
        return briquedos;
    }

    public void setBriquedos(List<String> briquedos) {
        this.briquedos = briquedos;
    }
}
