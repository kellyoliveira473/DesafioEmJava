import java.sql.ClientInfoStatus;
import java.util.List;

public class Pessoa {
    private String pessoa1;
    private String pessoa2;
    private  int contadorAnimais;
    private List<String>pessoa;
  public void Adotar(Pessoa Pessoa ){
      if(contadorAnimais>=3){
          System.out.println("O maxino de Animal disponivel para adoçao é 3");

      }else{
          System.out.println("Parabéns pela Adocao");
          contadorAnimais++;
      }
  }

    public Pessoa() {
    }

    public Pessoa(String pessoa1, String pessoa2, int contadorAnimais, List<String> pessoa) {
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
        this.contadorAnimais = contadorAnimais;
        this.pessoa= pessoa;
    }

    public String getPessoa1() {
        return pessoa1;
    }

    public void setPessoa1(String pessoa1) {
        this.pessoa1 = pessoa1;
    }

    public String getPessoa2() {
        return pessoa2;
    }

    public void setPessoa2(String pessoa2) {
        this.pessoa2 = pessoa2;
    }

    public int getContadorAnimais() {
        return contadorAnimais;
    }

    public void setContadorAnimais(int contadorAnimais) {
        this.contadorAnimais = contadorAnimais;
    }

    public List<String> getBriquedos() {
        return pessoa;
    }

    public void setBriquedos(List<String> briquedos) {
        this.pessoa = briquedos;
    }
}
