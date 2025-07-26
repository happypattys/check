import java.util.Scanner; 

public class vowelconstant {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a single character: ");
        String inputLine = scanner.nextLine(); 

        
        if (inputLine.length() == 1) {
            char ch = inputLine.charAt(0); 

            
            char lowerCaseCh = Character.toLowerCase(ch);

            
            if (lowerCaseCh >= 'a' && lowerCaseCh <= 'z') {
                
                if (lowerCaseCh == 'a' || lowerCaseCh == 'e' || lowerCaseCh == 'i' ||
                    lowerCaseCh == 'o' || lowerCaseCh == 'u') {
                    System.out.println(ch + " is a Vowel.");
                } else {
                    System.out.println(ch + " is a Consonant.");
                }
            } else {
                System.out.println(ch + " is not an alphabet character.");
            }
        } else {
            System.out.println("Invalid input. Please enter exactly one character.");
        }

        
        scanner.close();
    }
}
