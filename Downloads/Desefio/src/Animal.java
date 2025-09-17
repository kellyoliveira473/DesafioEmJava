
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Animal {
    private String nome;
    private String raça;
    private List<String>brinquedos;
    private List<String>animais;

    public Animal() {
    }

    public Animal(String nome, String raça, List<String> brinquedos, List<String> animais) {
        this.nome = nome;
        this.raça = raça;
        this.brinquedos = brinquedos;
        this.animais = animais;

    }
    public boolean podeAdotar(Pessoa pessoa){
        if(brinquedos != null){
            List<String>brinquedosPessoa = pessoa.getBrinquedos();
            for(int i =0; i < brinquedos.size(); i++){
                if (!brinquedosPessoa.contains(brinquedos.get(i))){
                    return false;
                }
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

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
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
}