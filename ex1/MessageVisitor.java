package ex1;

public class MessageVisitor implements Visitor {
    @Override
    public void visit(Onibus o) {
        System.out.println("Atencao para atualizacao de licencas");
    }
    @Override
    public void visit(Carro c) {
        System.out.println("Favor atualizar dados do IPVA");
    }
    public void visit(Bicicleta B){
        System.out.println("Comemore no parque o dia do ciclismo");
    }
}
