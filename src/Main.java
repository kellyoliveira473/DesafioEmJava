import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String>pessoas = new ArrayList<>();
        pessoas.add("Bola");
        pessoas.add("Skate");
        pessoas.add("Novelo");
        Pessoa pessoa= new Pessoa("pessoa1",pessoas,3);


        List<String>brinquedosDoRex= new ArrayList<>();
        brinquedosDoRex.add("Bola");
        brinquedosDoRex.add("Rato");
        Animal animal = new Animal("Rex","Cao",brinquedosDoRex,null);
        animal.exibirInformacoes();
        animal.podeAdotar(pessoa);

        List<String>brinquedosDaMimi= new ArrayList<>();
        brinquedosDaMimi.add("Lazer");
        brinquedosDaMimi.add("Novelo");
        Animal mimi= new Animal("Mimi","Gato",brinquedosDaMimi,null);
        mimi.exibirInformacoes();
        mimi.podeAdotar(pessoa);

        List<String>brinquedosJabuti= new ArrayList<>();
        brinquedosJabuti.add("Animal");
        brinquedosJabuti.add("SKate");
        Animal jabuti= new Animal("Loko","Jabuti",brinquedosJabuti,null);
        jabuti.exibirInformacoes();
        jabuti.podeAdotar(pessoa);
        pessoa.PodeAdotar(3);
    }
}
