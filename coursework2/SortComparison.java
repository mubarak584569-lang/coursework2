public class SortComparison {

    // cardCompare
    static int cardCompare(String card1, String card2) {
        String suits = "HCDS";
        // Suit going from Hearts to Spades, Hearts being the smallest

        // Getting the number for each card
        int num1 = Integer.parseInt(card1.substring(0, card1.length() -1));
        int num2 = Integer.parseInt(card2.substring(0, card2.length() -1));

        // Finding the suit also
        char suit1 = card1.charAt(card1.length() -1);
        char suit2 = card2.charAt(card2.length() -1);
        
        // Suit priority
        int st1 = suits.indexOf(suit1);
        int st2 = suits.indexOf(suit2);

        // Now firstly we compare suits
        if (st1 < st2) return -1;
        if (st2 < st2) return 1;

        // next comparing numbers of those suits
        if (num1 < num2) return -1;
        if (num1 > num2) return 1;

        return 0;
        
    }

    // bubbleSort
    static ArrayList<String> bubbleSort(ArrayList<String> array) {
         ArrayList<String> arr = new ArrayList<>(array);

         
         boolean swapped;
         
         for (int i = 0; i < arr.size() - 1; i++) {
            swapped = false;
        
            for (int j = 0; j < arr.size() - 1 - i; j++) { 
                if (cardCompare(arr.get(j), arr.get (j + 1)) > 0) { 

                    String temp = arr.get(j); 
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;              
                }
         }
        
         if (!swapped) {
            break;

         }
    }
    return arr;
    
}
