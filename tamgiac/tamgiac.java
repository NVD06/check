package tamgiac;

import java.util.*;
import java.util.function.BooleanSupplier;

public class tamgiac {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            
            if (a < 1 || a > 200 || b < 1 || b > 200 || c < 1 || c > 200) {
                System.out.println("InvalidInput");
                return;
            }
            
            if (a == b && b == c) {
                System.out.println("tam giac deu");
                return;
            }
            
            if (a == b || b == c || c == a) {
                System.out.println("tam giac can");
                return;
            }
            
            if (a * a == b * b + c * c || c * c == b * b + a * a || b * b == a * a + c * c) {
                System.out.println("tam giac vuong");
                return;
            }
            
            if ((a * a == b * b + c * c && b == c) || (c * c == b * b + a * a && b == a) || (b * b == a * a + c * c && a == c)) {
                System.out.println("tam vuong can");
                return;
            }
            
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("khong phai tam giac");
                return;
            }
        }
        
        System.out.println("tam giac thuong");
    }

    public static BooleanSupplier isTriangle(int i, int j, int k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTriangle'");
    }
}
