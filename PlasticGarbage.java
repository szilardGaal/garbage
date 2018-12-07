public class PlasticGarbage extends Garbage {
    boolean isClean;

    public PlasticGarbage(String n, boolean cl) {
        super(n);
        isClean = cl;
    }

    void clean() {
        this.isClean = true;
    }

    boolean isClean() {
        return this.isClean;
    }
}
