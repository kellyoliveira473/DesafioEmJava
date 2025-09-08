import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String>brinquedosPessoa1=new ArrayList<>();
        brinquedosPessoa1.add("Rato");
        brinquedosPessoa1.add("Laser");
        brinquedosPessoa1.add("Bola");
        brinquedosPessoa1.add("Skate");
        Pessoa  pessoa = new Pessoa(brinquedosPessoa1);

        List<String>brinquedosPessoa2=new ArrayList<>();
        brinquedosPessoa2.add("Novelo");
        brinquedosPessoa2.add("Caixa");
        brinquedosPessoa2.add("Rato");
        brinquedosPessoa2.add("Bola");
        Pessoa pessoa2= new Pessoa(brinquedosPessoa2);

        List<String>brinquedosDoRex= new ArrayList<>();
        brinquedosDoRex.add("Rato");
        brinquedosDoRex.add("Bola");
         Animal rex = new Animal("Rex","Cão",brinquedosDoRex);

        List<String>brinquedosDaMimi= new ArrayList<>();
        brinquedosDaMimi.add("Bola");
        brinquedosDaMimi.add("Laser");
        Animal mimi = new Animal("Mini","Gato",brinquedosDaMimi);


        List<String>brinquedosDofofo= new ArrayList<>();
        brinquedosDofofo.add("Bola");
        brinquedosDoRex.add("Rato");
        brinquedosDofofo.add("Laser");
        Animal fofo = new Animal("Fofo","Gato",brinquedosDofofo);


        List<String>brinquedosDoZero= new ArrayList<>();
        brinquedosDoZero.add("Rato");
        brinquedosDoZero.add("Bola");
        Animal Zero = new Animal("Zero","Gato",brinquedosDoZero);

        List<String>brinquedosDoBola= new ArrayList<>();
        brinquedosDoBola.add("Caixa");
        brinquedosDoBola.add("Novelo");
        Animal bola = new Animal("Bola","Cão",brinquedosDoBola);


        List<String>brinquedosDoBebe= new ArrayList<>();
        brinquedosDoBebe.add("Laser");
        brinquedosDoBebe.add("Rato");
        brinquedosDoBebe.add("Bola");
        Animal bebe = new Animal("Bebe","Cão",brinquedosDoBebe);


        List<String>brinquedosDoLoco= new ArrayList<>();
        brinquedosDoLoco.add("Skate");
        brinquedosDoLoco.add("Rato");
        Animal loco = new Animal("Loco","Jabuti",brinquedosDoLoco);

    }}