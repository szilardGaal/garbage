public class PlasticGarbage extends Garbage {
    String name;
    boolean isClean;

    PlasticGarbage(String n, boolean cl) {
        name = n;
        isClean = cl;
    }

    void clean() {
        this.isClean = true;
    }

    boolean isClean() {
        return this.isClean;
    }
}
