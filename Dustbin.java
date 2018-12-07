public class Dustbin {
    String color;
    PaperGarbage[] paperContent;
    PlasticGarbage[] plasticContent;
    Garbage[] houseWasteContent;

    Dustbin(String col) {
        color = col;
    }

    PaperGarbage [] getPaperContent() {
        return paperContent;
    }

    PlasticGarbage[] getPlasticContent() {
        return plasticContent;
    }

    Garbage[] getHouseWasteContent() {
        return houseWasteContent;
   }
}
