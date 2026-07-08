public class HtmlVisitor implements Visitor{
    public void visit(Paragraph paragraph) {
        System.out.println("Transformando paragrafo para HTML");
    }

    public void visit(Table table) {
        System.out.println("Transformando tabela para HTML");
    }

    public void visit(Image image) {
        System.out.println("Transformando imagem para HTML");
    }
}
