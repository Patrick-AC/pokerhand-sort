package pokerHands;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static Hand hashGroup() {

        HashMap<String, Integer> finalRankList = new HashMap<>();
        finalRankList.put("rank2", 0);
        finalRankList.put("rank3", 0);
        finalRankList.put("rank4", 0);
        finalRankList.put("rank5", 0);
        finalRankList.put("rank6", 0);
        finalRankList.put("rank7", 0);
        finalRankList.put("rank8", 0);
        finalRankList.put("rank9", 0);
        finalRankList.put("rank10", 0);
        finalRankList.put("rankJ", 0);
        finalRankList.put("rankQ", 0);
        finalRankList.put("rankK", 0);
        finalRankList.put("rankA", 0);

        HashMap<String, Integer> finalSuitList = new HashMap<>();
        finalSuitList.put("suitClub", 0);
        finalSuitList.put("suitSpade", 0);
        finalSuitList.put("suitDiamond", 0);
        finalSuitList.put("suitHeart", 0);

        return new Hand(finalRankList);
    }

    public static Hand arrayGroup() {
        //Input of the cards in your current hand.
        ArrayList<String> cardTypeList = new ArrayList<String>();
        cardTypeList.add("2S");
        cardTypeList.add("4S");
        cardTypeList.add("7C");
        cardTypeList.add("AH");
        cardTypeList.add("7D");

//Card rank split from card suit, lists each card rank.
        ArrayList<String> cardRankList = new ArrayList<>();
        cardRankList.add(cardTypeList.get(0).substring(0,1));
        cardRankList.add(cardTypeList.get(1).substring(0,1));
        cardRankList.add(cardTypeList.get(2).substring(0,1));
        cardRankList.add(cardTypeList.get(3).substring(0,1));
        cardRankList.add(cardTypeList.get(4).substring(0,1));

//Card suit split from card rank, lists each card suit.
        ArrayList<String> cardSuitList = new ArrayList<>();
        cardSuitList.add(cardTypeList.get(0).substring(1));
        cardSuitList.add(cardTypeList.get(1).substring(1));
        cardSuitList.add(cardTypeList.get(2).substring(1));
        cardSuitList.add(cardTypeList.get(3).substring(1));
        cardSuitList.add(cardTypeList.get(4).substring(1));

        return new Hand(cardRankList, cardSuitList);
    }

    public static void returnRank(ArrayList cardRankList, HashMap<String,Integer> finalRankList) {
        for(int i = 0; i < 5; i++) {
            if (cardRankList.get(i).equals("2")) {
                finalRankList.put("rank2",finalRankList.get("rank2") + 1);
            } else if (cardRankList.get(i).equals("3")) {
                finalRankList.put("rank3",finalRankList.get("rank3") + 1);
            } else if (cardRankList.get(i).equals("4")) {
                finalRankList.put("rank4",finalRankList.get("rank4") + 1);
            } else if (cardRankList.get(i).equals("5")) {
                finalRankList.put("rank5",finalRankList.get("rank5") + 1);
            } else if (cardRankList.get(i).equals("6")) {
                finalRankList.put("rank6",finalRankList.get("rank6") + 1);
            } else if (cardRankList.get(i).equals("7")) {
                finalRankList.put("rank7",finalRankList.get("rank7") + 1);
            } else if (cardRankList.get(i).equals("8")) {
                finalRankList.put("rank8",finalRankList.get("rank8") + 1);
            } else if (cardRankList.get(i).equals("9")) {
                finalRankList.put("rank9",finalRankList.get("rank9") + 1);
            } else if (cardRankList.get(i).equals("10")) {
                finalRankList.put("rank10",finalRankList.get("rank10") + 1);
            } else if (cardRankList.get(i).equals("J")) {
                finalRankList.put("rankJ",finalRankList.get("rankJ") + 1);
            } else if (cardRankList.get(i).equals("Q")) {
                finalRankList.put("rankQ",finalRankList.get("rankQ") + 1);
            } else if (cardRankList.get(i).equals("K")) {
                finalRankList.put("rankK",finalRankList.get("rankK") + 1);
            } else if (cardRankList.get(i).equals("A")) {
                finalRankList.put("rankA",finalRankList.get("rankA") + 1);
            } else System.out.println("Error, wrong input.");
        }
    }

    public static void returnSuit(ArrayList cardSuitList, HashMap<String, Integer> finalSuitList) {
        for(int i = 0; i < 5; i++) {
            if (cardSuitList.get(i).equals("C")) {
                finalSuitList.put("suitClub",finalSuitList.get("suitClub") + 1);
            } else if (cardSuitList.get(i).equals("S")) {
                finalSuitList.put("suitSpade",finalSuitList.get("suitSpade") + 1);
            } else if (cardSuitList.get(i).equals("D")) {
                finalSuitList.put("suitDiamond",finalSuitList.get("suitDiamond") + 1);
            } else if (cardSuitList.get(i).equals("H")) {
                finalSuitList.put("suitHeart",finalSuitList.get("suitHeart") + 1);
            } else System.out.println("Error, wrong input");
        }
    }

    public static void cardReader () {
        if(finalH)
    }

    public static void main(String[] args) {
        Hand hand = arrayGroup();
        Hand finalHand = hashGroup();
        /*
        //Write code that adds +1 to (int rank2 = 0) if a cards rank is 2 and so on
if(card1Number == "2"){
    rank2 += 1;
}

        //Five of a kind
        if(card1Number == card2Number && card1Number == card3Number && card1Number == card4Number && card1Number == card5Number) {
            System.out.println("Five of a kind");
        //Straight Flush
        } else if
*/
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
