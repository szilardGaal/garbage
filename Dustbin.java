public class Dustbin {
    String color;
    PaperGarbage[] paperContent, tempPaperGarbages;
    PlasticGarbage[] plasticContent, tempPlasticGarbages;
    Garbage[] houseWasteContent, tempHouseWasteContent;

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
                if (plasticContent == null) {
                    plasticContent = new PlasticGarbage[1];
                    plasticContent[0] = (PlasticGarbage)garbage;
                } else {
                    tempPlasticGarbages = new PlasticGarbage[plasticContent.length + 1];
                    for (int i = 0; i < plasticContent.length; i++) {
                        tempPlasticGarbages[i] = plasticContent[i];
                    }
                    tempPlasticGarbages[tempPlasticGarbages.length] = (PlasticGarbage)garbage;
                    plasticContent = tempPlasticGarbages;
                }
            }

        } else if (garbage instanceof PaperGarbage) {
            if (((PaperGarbage)garbage).isSqueezed() == false) {
                throw new DustbinContentException();
            } else {
                if (paperContent == null) {
                    paperContent = new PaperGarbage[1];
                    paperContent[0] = (PaperGarbage)garbage;
                } else {
                    tempPaperGarbages = new PaperGarbage[paperContent.length + 1];
                    for (int i = 0; i < paperContent.length; i++) {
                        tempPaperGarbages[i] = paperContent[i];
                    }
                    tempPaperGarbages[tempPaperGarbages.length] = (PaperGarbage)garbage;
                    paperContent = tempPaperGarbages;
                }
            }
        } else {
            if (houseWasteContent == null) {
                houseWasteContent = new Garbage[1];
                houseWasteContent[0] = garbage;
            } else {
                tempHouseWasteContent = new Garbage[houseWasteContent.length + 1];
                for (int i = 0; i < houseWasteContent.length; i++) {
                    tempHouseWasteContent[i] = houseWasteContent[i];
                }
                tempHouseWasteContent[tempHouseWasteContent.length] = garbage;
                houseWasteContent = tempHouseWasteContent;
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