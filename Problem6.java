import java.util.*;

class Problem6 {
    public static void main(String[] args) {

        //int countr;
        
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Value : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            //int countr = 1;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i == a) {
                        System.out.print(" " + j*2 +"  ");
                    }else{
                        System.out.print(" " + j+"  ");
                    }
                }
                for (int k = i-1; k >= 1; k--) {
                    if (i == a) {
                        System.out.print(" " + k*2 +"  ");
                    }else{
                        System.out.print(" " + k+"  ");
                    }
                }
                System.out.println();
            }
    
            for (int i = a-1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j+"  ");
                }
                for (int k = i-1; k >= 1; k--) {
                    System.out.print(" " + k+"  ");
                }
                System.out.println();
            }
        }else{
            //int countr = 0;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j+"  ");
                }
                for (int k = i-1; k >= 1; k--) {
                    System.out.print(" " + k+"  ");
                }
                System.out.println();
            }
    
            for (int i = a-1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j+"  ");
                }
                for (int k = i-1; k >= 1; k--) {
                    System.out.print(" " + k+"  ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
