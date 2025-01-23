import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want:");
        String name = sc.nextLine();
        int count = 0;

        for (int j = 0; j < name.length(); j++) {
            char ch = name.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println("The number of vowels is: " + count);
        sc.close();
    }
}
