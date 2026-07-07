import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro("Branco", "Ford", "Corcel II"));
        veiculos.add(new Bicicleta("Laranja"));
        veiculos.add(new Onibus(20, 2015));


        Visitor print = new PrintVisitor();
        Visitor mensagem = new MessageVisitor();

        for (Veiculo v : veiculos) {
            v.accept(print);
            v.accept(mensagem);
        }

    }
}
