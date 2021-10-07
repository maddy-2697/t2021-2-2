import java.util.*;
public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your String : ");
        String input = sc.nextLine();

        System.out.println("You Entered String is : " + input);

        String newstString = new String();
        for (int i = 0; i < input.length(); i++) {
            char ino ='Z';
            if (input.charAt(i) != ino) {
                newstString += (char) (input.charAt(i) + 1);
            }else{
                newstString += (char) (input.charAt(i) % 26 +53); 
            }
        }

        char[] in1 = newstString.toCharArray();

        String output = "";
        for (int i = in1.length-1; i >= 0; i--) {
            output += in1[i];
        }

        System.out.println("Final String is : " + output);
        sc.close();
    }
}
