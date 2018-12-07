public class Dustbin {
    String color;
    PaperGarbage[] paperContent;
    PlasticGarbage[] plasticContent;
    Garbage[] houseWasteContent;

    PaperGarbage [] getPaperContent() {
        for (Object litter: getHouseWasteContent()) {
            if (litter instanceof PaperGarbage) {
                litter = (PaperGarbage)litter;
        
            }
        }
        return paperContent;
    }

    PlasticGarbage[] getPlasticContent() {
        for (Object litter: getHouseWasteContent()) {
            if (litter instanceof PlasticGarbage) {
                litter = (PlasticGarbage)litter;
            }
        }
        return plasticContent;
    }

    Garbage[] getHouseWasteContent() {
        return houseWasteContent;
   }
}
