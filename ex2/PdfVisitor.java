public class PdfVisitor implements Visitor{
    public void visit(Paragraph paragraph) {
        System.out.println("Transformando paragrafo para PDF");
    }

    public void visit(Table table) {
        System.out.println("Transformando tabela para PDF");
    }

    public void visit(Image image) {
        System.out.println("Transformando imagem para PDF");
    }
}
