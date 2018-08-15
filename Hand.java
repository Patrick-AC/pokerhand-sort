package pokerHands;

import java.util.ArrayList;
import java.util.HashMap;

public class Hand {

    private ArrayList<String> cardRankList;
    private ArrayList<String> cardSuitList;
    private HashMap<String, Integer> finalRankList;

    public Hand(ArrayList<String> cardRankList, ArrayList<String> cardSuitList) {
        this.cardRankList = cardRankList;
        this.cardSuitList = cardSuitList;
    }

    public ArrayList<String> getCardSuitList() {
        return cardSuitList;
    }

    public void setCardSuitList(ArrayList<String> cardSuitList) {
        this.cardSuitList = cardSuitList;
    }

    public ArrayList<String> getCardRankList() {
        return cardRankList;
    }

    public void setCardRankList(ArrayList<String> cardRankList) {
        this.cardRankList = cardRankList;
    }


    public void finalHand(HashMap<String, Integer> finalRankList) {
        this.finalRankList = finalRankList;
    }
        public HashMap<String, Integer> getFinalRankList() {return finalRankList;}

        public void setFinalRankList(HashMap<String, Integer> finalRankList){this.finalRankList = finalRankList;}
    }

