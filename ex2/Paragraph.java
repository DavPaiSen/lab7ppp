public class Paragraph implements DocumentElement{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
