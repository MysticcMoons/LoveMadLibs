public class MadLibsWithStack<T> {
    private final StackInterface<T> inputStack;

    public MadLibsWithStack(StackInterface<T> stack) {
        this.inputStack = stack;
    }

    public void pushInput(T input) {
        inputStack.push(input);
    }

    public String buildStory(String name) {
        if (inputStack.size() < 11) {
            return "Not enough words to build a story!";
        }

        //pop the initial 3 words
        String noun1 = (String) inputStack.pop();
        String verb1 = (String) inputStack.pop();
        String adjective1 = (String) inputStack.pop();

        //pop the 8 additional words
        String word4 = (String) inputStack.pop();
        String word5 = (String) inputStack.pop();
        String word6 = (String) inputStack.pop();
        String word7 = (String) inputStack.pop();
        String word8 = (String) inputStack.pop();
        String word9 = (String) inputStack.pop();
        String word10 = (String) inputStack.pop();
        String word11 = (String) inputStack.pop();

        //build the love letter
        return "\nDearest, Most Beloved " + name + ",\n\n"
             + "As the moonlight bathes the earth in its pale, silvery glow, my thoughts turn to you, "
             + "and my heart swells with the most " + adjective1 + " longing. Each night I lay awake, "
             + "dreaming of your sweet presence, and how you, with your " + adjective1 + " smile, make my soul " + verb1 + " with the deepest emotion.\n\n"
             + "Oh, my love, how can I describe this feeling that overwhelms me? It is as if the very " + noun1 + " of my being "
             + "aches for your touch, and I find myself " + verb1 + " in the hope of one day being united with you.\n\n"
             + "Your " + word4 + " is as radiant as a " + word5 + " in bloom, and your " + word6 + " voice echoes in my heart like the " + word7 + " winds.\n\n"
             + "I am consumed by the " + word8 + " fire that burns within me, as I " + verb1 + " and " + word9 + " to the thought of our eternal union.\n\n"
             + "My love, my " + word10 + ", my soul " + word11 + " for you endlessly, and I remain devotedly yours.\n\nYours eternally, " + name + ".";
    }
}
