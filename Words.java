import java.util.Random;

public class Words {
    private String[] randomWords ={"student","animal","plane","independent",
            "regularity", "aeroplane","palindrome","happiness"
            ,"sorrow"};
    private String selectedWord;
    private Random random = new Random();
    private char[] letters;// creating array of chars
    Words(){                                        //nextInt(limit: in this case it is till the length of the string array)
        selectedWord = randomWords[random.nextInt(randomWords.length)];//nextInt() scans the next token of the input
        //setting the word as "--------"(blanks) which need to be found
        letters = new char[selectedWord.length()];
    }
    public String toString(){
        // changed string to StringBuilder as it is more efficient.
        //  Earlier we were using string instead of StringBuilder
        StringBuilder text = new StringBuilder();
        for(char letter:letters){
            text.append(letter == '\u0000' ? '-' : letter);//letter here is char letter (for loop @19)
            text.append(" ");
        }
        return text.toString();
    }
    public boolean isGuessedRight(){
        for(char letter : letters){
            if(letter == '\u0000') {
                return false;
            }
        }return true;
    }

    public boolean guess(char letter){
        boolean guessedRight=false;
        for(int i=0;i<selectedWord.length();i++){
             if(letter == selectedWord.charAt(i)){
                 letters[i]=letter; // letter @ line 25
                 guessedRight =true;
             }
        }return guessedRight;
    }
}

