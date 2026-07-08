public class Image implements DocumentElement{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
