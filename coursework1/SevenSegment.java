public class SevenSegment {
    static String ssd(int d, int n) { 
    switch ((d*10)+n) { 
        case  1: case  5: case 21: case 23: case 25: case 31: case 33: case 35: 
        case 43: case 51: case 53: case 55: case 61: case 63: case 65: case 71: 
        case 81: case 83: case 85: case 91: case 93: case 95: 
            return " --  "; 
        case 24: case 52: case 62: 
            return "|    "; 
        case 12: case 14: case 22: case 32: case 34: case 44: case 54: case 72: 
        case 74: case 94: 
            return "   | "; 
        case  2: case  4: case 42: case 64: case 82: case 84: case 92: 
            return "|  | "; 
        default: return "     "; 
    } 
} 
static void display(int number) {
    String numberString = Integer.toString(number);
    int len = numberString.length();

    for(int line = 1; line <= 5; line++){
        String row = "";

        for (int i = 0; i < len; i++){
             int digit = numberString.charAt(i) - '0';
             row += ssd(digit, line);
        }
        System.out.println(row);
    }
}   

    public static void main(String[] args) {
        display (0);
    }
}
