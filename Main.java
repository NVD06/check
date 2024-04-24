public class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + getNumberType(i));
        }
    }

    public static String getNumberType(int i) {
        if (i % 2 == 0) {
            return "chan";
        } else {
            return "le";
        }
    }
}
