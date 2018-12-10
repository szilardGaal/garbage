public class Main {

    public static void main(String[] args) throws DustbinContentException {

        Garbage[] rottenTomatoes = new Garbage[3];
        for (int i = 0; i < 3; i++) {
            rottenTomatoes[i] = new Garbage("rotten tomato nr." + (i+1));
        }

        Garbage milkJug = new PlasticGarbage("plastic milk jug", false);
        Dustbin dustbin = new Dustbin("Jenny's handsome");
        dustbin.displayContents();

        for (int i = 0; i < 3; i++) {
            dustbin.throwOutGarbage(rottenTomatoes[i]);
        }
        if (!((PlasticGarbage)milkJug).isClean()) {
            ((PlasticGarbage)milkJug).clean();
        }
        
        dustbin.throwOutGarbage(milkJug);
        dustbin.emptyContents();
        dustbin.displayContents();
    }   
}
