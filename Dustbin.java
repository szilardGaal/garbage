public class Dustbin {
    String color;
    PaperGarbage[] paperContent, tempPaperGarbages;
    PlasticGarbage[] plasticContent, tempPlasticGarbages;
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

   public void displayContents() {

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
                if (plasticContent == null) {
                    plasticContent = new PlasticGarbage[1];
                    plasticContent[0] = garbage;
                } else {
                    tempPlasticGarbages = new PlasticGarbage[plasticContent.length + 1];
                    for (int i = 0; i < plasticContent.length; i++) {
                        tempPlasticGarbages[i] = plasticContent[i];
                    }
                    tempPlasticGarbages[tempPlasticGarbages.length] = garbage;
                    plasticContent = tempPlasticGarbages;
                }
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