

public class Bicicleta extends Veiculo{
    public void accept(Visitor v){
        v.visit(this);
    }
    private String cor;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Bicicleta(String cor) {
        this.cor = cor;
    }

    
}
