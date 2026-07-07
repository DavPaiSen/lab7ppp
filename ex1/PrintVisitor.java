

public class PrintVisitor implements Visitor {
    public void visit(Carro c){
        System.out.println("\n\nCarro:");
        System.out.println("Cor: " + c.getCor());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Marca: " + c.getMarca());
    }
    public void visit (Onibus o){
        System.out.println("\n\nOnibus:");
        System.out.println("Quantidade de lugares: " + o.getQtd_lugares());
        System.out.println("Ano de fabricacao: " + o.getAno_fabricacao());
    }
    public void visit (Bicicleta b){
        System.out.println("\n\nBicicleta:");
        System.out.println("Cor: " + b.getCor());
    }

}
