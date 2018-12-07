public class PaperGarbage extends Garbage {
    String name;
    boolean squeezed;

    PaperGarbage(String n, boolean isSq) {
        name = n;
        squeezed = isSq;
    }

    void squeeze() {
        this.squeezed = true;
    }

    boolean isSqueezed() {
        return this.squeezed;
    }
}
