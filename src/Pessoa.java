import java.sql.ClientInfoStatus;
import java.util.List;

public class Pessoa {
    private String pessoa;
    private List<String>brinquedos;
    private int contandor;
    private List<String> animais;

    public Pessoa() {
    }

    public Pessoa(String pessoa, List<String> brinquedos, int contandor) {
        this.pessoa = pessoa;
        this.brinquedos = brinquedos;
        this.contandor = contandor;
    }
    public boolean temBrinquedos(){
        return !brinquedos.isEmpty();
    }
public Boolean PodeAdotar(int contandor){
        if(contandor <3){
            System.out.println("O animal esta disponivel para adoção");
            return  true;
        }else {
            System.out.println("O limite de Animal é 3 ,o animal deve  retornar para o abrigo ");
            return  false;
        }

}


    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public List<String> getBrinquedos() {
        return brinquedos;
    }

    public void setBrinquedos(List<String> brinquedos) {
        this.brinquedos = brinquedos;
    }

    public int getContandor() {
        return contandor;
    }

    public void setContandor(int contandor) {
        this.contandor = contandor;
    }

    public List<String> getAnimais() {
        return animais;
    }

    public void setAnimais(List<String> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + pessoa + '\'' +
                ", brinquedos=" + brinquedos +
                ", contandor=" + contandor +
                '}';
    }
}
