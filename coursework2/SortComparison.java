
import java.util.ArrayList;

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
        if (st1 > st2) return 1;

        // next comparing numbers of those suits
        if (num1 < num2) return -1;
        if (num1 > num2) return 1;

        return 0;
        
    }

    // bubbleSort
    static ArrayList<String> bubbleSort(ArrayList<String> array) {
        // TODO add Bubble sort using the above cardCompare

         ArrayList<String> arrayList = new ArrayList<>(array);
         boolean sorted;
         
         for (int i = 0; i < arrayList.size() - 1; i++) {
            sorted = false;
        
            for (int j = 0; j < arrayList.size() - 1 - i; j++) { 
                if (cardCompare(arrayList.get(j), arrayList.get(j + 1)) > 0) { 

                    String temp = arrayList.get(j); 
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                    sorted = true;              
                }
            } 
        
             if (!sorted) break;

         }
         
         return arrayList;
    
    }

    // mergeSort
    static ArrayList<String> mergeSort(ArrayList<String> list) {
        // TODO adding Merge sort, splitting and merging

        if (list.size () <= 1) return list;

        int mid = list.size() / 2;

        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList <>();

        for (int i = 0; i < mid; i++) left.add(list.get(i));

        // Spliting
        for (int i = mid; i < list.size(); i++) right.add(list.get(i));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }
    static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        // Merging the 2 sorted list and using cardCompare

        ArrayList<String> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size()) {
            if (j < right.size()){
                if (cardCompare(left.get(i),right.get(j)) <= 0) {
                    result.add(left.get(i));
                    i++;
                } else {
                    result.add(right.get(j));
                    j++;
                }
            } else {
                result.add(left.get(i));
                i++;
            }
        }
        
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        
        return result;

        }
    }
