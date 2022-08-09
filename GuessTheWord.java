import java.util.Scanner;

public class GuessTheWord {
    private boolean play =true;
    private Words randonWord= new Words();
    private Scanner sc = new Scanner(System.in);
    private int Lives =10 ;//pointer in the game
    private char lastRound;
    public void start(){
        do{
            showWord();
            getInput();
            checkInput();
        }while(play);

    }

    void showWord(){
        System.out.println("you have "+Lives+" lives left");
        System.out.println(randonWord);
    }
    void getInput(){

        System.out.println("Enter the letter you have guessed");
        String userGuess= sc.nextLine();
        lastRound =userGuess.charAt(0);
    }
    void checkInput(){
        boolean isGuessedRight =randonWord.guess(lastRound);
        if(isGuessedRight){
        if(randonWord.isGuessedRight()){

            System.out.println("CONGRATS!! YOU HAVE FOUND THE WORD");
            System.out.println("The word is      :  "+randonWord);
            play =false;
        }
        }else{
            Lives--;
            if(Lives == 0){
                System.out.println("Game over");
                play=false;
            }
        }
    }

    public void end() {
        sc.close();
    }
}
