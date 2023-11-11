public class ParseAndPrintNumber {
    public static void main(String[] args) {
       String str = String.valueOf(10);
        parseAndPrintNumber(str);
    }
    public static void parseAndPrintNumber(String str) {
        int result = Integer.parseInt(str) / 2;
        System.out.println(result);
    }
}
