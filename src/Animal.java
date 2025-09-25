
import java.util.Collections;
import java.util.List;

public class Animal {
    private String nome;
    private String raca;
    private List<String> brinquedos;
    private List<String> animais;

    public Animal() {
    }

    public Animal(String nome, String raca, List<String> brinquedos, List<String> animais) {
        this.nome = nome;
        this.raca = raca;
        this.brinquedos = brinquedos;
        this.animais = animais;

    }


    public void exibirInformacoes(){
        System.out.println("Nome do animal "+nome+ " ,Raça do animal "+raca+" ,Brinquedos Preferidos "+brinquedos);
    }

    public boolean podeAdotar(Pessoa pessoa) {
        if (this.brinquedos != null) {
            List<String> brinquedosPessoa = pessoa.getBrinquedos();
            if (brinquedosPessoa != null) {
                for (String brinquedo : this.brinquedos) {
                    if (!brinquedosPessoa.contains(brinquedo)) {
                        System.out.println("Esta faltando itens");
                        return false;
                    }
                }
            }
        }

                if (nome.contains("Gato")){
                    System.out.println("A lista esta completa");
        }

        if (nome.contains("Jabuti")) {
            List<String> animal = pessoa.getAnimais();

            if (animal != null && !animal.isEmpty()) {
                System.out.println("Pode adotar o Jabuti");
            } else {
                System.out.println("Está faltando experiência com animais");
                return false;
            }
        }


        return true;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<String> getBrinquedos() {
        return brinquedos;
    }

    public void setBrinquedos(List<String> brinquedos) {
        this.brinquedos = brinquedos;
    }

    public List<String> getAnimais() {
        return animais;
    }

    public void setAnimais(List<String> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", brinquedos=" + brinquedos +
                ", animais=" + animais +
                '}';
    }
}

