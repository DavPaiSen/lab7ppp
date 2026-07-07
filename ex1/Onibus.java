

public class Onibus extends Veiculo {
    public void accept(Visitor v){
        v.visit(this);
    }
    private int qtd_lugares;
    private  int ano_fabricacao;

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }
    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }
    public int getQtd_lugares() {
        return qtd_lugares;
    }
    public Onibus(int qtd_lugares, int ano_fabricacao) {
        this.qtd_lugares = qtd_lugares;
        this.ano_fabricacao = ano_fabricacao;
    }


    
}
