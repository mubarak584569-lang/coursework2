public class SortComparison {

    // cardCompare
    static int cardCompare(String card1, String card2) {
        String suits = "HCDS";
        // Suit going from Hearts to Spades, Hearts being the biggest

        int num1 = Integer.parseInt(card1.substring(0, card1.length() -1));
        int num2 = Integer.parseInt(card2.substring(0, card2.length() -1));

        char suit1 = card1.charAt(card1.length() -1);
        char suit2 = card2.charAt(card2.length() -1);
        
        int s1 = suits.indexOf(suit1);
        int s2 = suits.indexOf(suit2);

        // Now firstly we compare suits
        if (s1 < s2) return -1;
        if (s2 < s2) return 1;

        // next comparing numbers of those suits
        if (num1 < num2) return -1;
        if (num1 > num2) return 1;

        return 0;
        
    }
    public static void main(String[] args) {
        System.out.println(cardCompare("4H", "7H"));
    }
}
