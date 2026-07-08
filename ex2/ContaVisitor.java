public class ContaVisitor implements Visitor{
    public void visit(Paragraph paragraph) {
        System.out.println("Contando as palavras no paragrafo");
    }

    public void visit(Table table) {
        System.out.println("Contando palavras na tabela");
    }

    public void visit(Image image) {
        System.out.println("Contando palavras na imagem");
    }
}
