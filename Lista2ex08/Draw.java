package Lista2ex08;

import java.util.Random;

public class Draw {
    
    private int number;
    private int guessCount;
    private boolean guessed = false;

    public Draw() {
        Random random = new Random();
        this.number = random.nextInt(100);
        this.guessCount = 0;
    }

    public boolean guess(int userGuess) throws Exception {
        if (guessed) {
            //usuário já acertou palpite
            throw new Exception("Sorteio encerrado, usuário já acertou!");
        }

        if (!userCanGuess()) {
            //usuário já excedeu as tentativas
            throw new Exception("Usuário excedeu as tentativas! O número sorteado era: " + number);
        }

        guessCount ++;
        return userGuess == number;
    }

    private boolean userCanGuess() {
        return !guessed && guessCount < 10;

    }
}