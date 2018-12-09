public class Dustbin {
    String color;
    PaperGarbage[] paperContent;
    PlasticGarbage[] plasticContent;
    Garbage[] houseWasteContent;

    Dustbin(String col) {
        color = col;
    }

    PaperGarbage[] getPaperContent() {
        return paperContent;
    }

    PlasticGarbage[] getPlasticContent() {
        return plasticContent;
    }

    Garbage[] getHouseWasteContent() {
        return houseWasteContent;
   }

   public void displayCOntents() {

        System.out.println(this.color + " dustbin!");

        System.out.println("\nHouse waste content: " + getHouseWasteContent().length + " item(s).\n");
        for (Object item: getHouseWasteContent()) {
            System.out.println(item);
        }
        System.out.println("\nPaper content: " + getPaperContent().length + " item(s).\n");
        for (Object item: getPaperContent()) {
            System.out.println(item);
        }
        System.out.println("\nPlastic content: " + getPlasticContent().length + " item(s).\n");
        for (Object item: getPlasticContent()) {
            System.out.println(item);
        }
    }

    public void throwOutGarbage(Garbage garbage) throws DustbinContentException {

        if (garbage instanceof PlasticGarbage) {   
            if (((PlasticGarbage)garbage).isClean() == false) {
                throw new DustbinContentException();
            } else {
                garbage = (PlasticGarbage)garbage;
            }

        } else if (garbage instanceof PaperGarbage) {
            if (((PaperGarbage)garbage).isSqueezed() == false) {
                throw new DustbinContentException();
            } else {
                garbage = (PaperGarbage)garbage;
            }
        }
    }
    
    public void emptyContents() {
        
        eraser(plasticContent);
        eraser(paperContent);
        eraser(houseWasteContent);
    }

    private void eraser(Object[] litter) {

        litter = null;
    }
}

class DustbinContentException extends Exception {

}