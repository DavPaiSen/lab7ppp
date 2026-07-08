public class Table implements DocumentElement{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
