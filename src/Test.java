import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string :");
        String string = scan.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < string.length() ; i++) {
            int ascii = (int) string.charAt(i);
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255 ; j++) {
            if(frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character +
                "' with a frequency of " + max + " times");

    }
}
