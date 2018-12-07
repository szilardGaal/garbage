public class PaperGarbage extends Garbage {
    boolean squeezed;

    public PaperGarbage(String n, boolean isSq) {
        super(n);
        squeezed = isSq;
    }

    void squeeze() {
        this.squeezed = true;
    }

    boolean isSqueezed() {
        return this.squeezed;
    }
}
