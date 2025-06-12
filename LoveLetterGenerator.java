import java.util.Scanner;

public class LoveLetterGenerator {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
           
            StackInterface<String> stack = new ArrayStack<>();
            MadLibsWithStack<String> madLibs = new MadLibsWithStack<>(stack);
            
            //prompt user for initial Mad Libs words
            System.out.print("Enter an adjective (Descriptive Words): ");
            madLibs.pushInput(scanner.nextLine());
            
            System.out.print("Enter a verb (Action): ");
            madLibs.pushInput(scanner.nextLine());
            
            System.out.print("Enter a noun(Person, Place, or Thing): ");
            madLibs.pushInput(scanner.nextLine());
            
            //8 additional words
            System.out.println("Please enter 8 more words (adjectives, verbs, or nouns):");
            
            for (int i = 1; i <= 8; i++) {
                System.out.print("Enter word " + i + ": ");
                madLibs.pushInput(scanner.nextLine());
            }
            
            //name to personalize the letter
            System.out.print("\nEnter your name: ");
            String name = scanner.nextLine();
            
            //build and print love letter
            String letter = madLibs.buildStory(name);
            System.out.println(letter);
        }
    }
}
