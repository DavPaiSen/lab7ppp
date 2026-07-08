import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DocumentElement> lista = new ArrayList<DocumentElement>();
        lista.add(new Paragraph());
        lista.add(new Table());
        lista.add(new Image());

        PdfVisitor pdfVisitor = new PdfVisitor();
        HtmlVisitor htmlVisitor = new HtmlVisitor();
        ContaVisitor contaVisitor = new ContaVisitor();


        for (DocumentElement e : lista) {
            e.accept(contaVisitor);
            e.accept(htmlVisitor);
            e.accept(pdfVisitor);
        }
    }
}
