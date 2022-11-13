package theeradon.CP3406.practical01;

import java.util.Random;

public class Game {

    public int number;

    public boolean guessedCorrect;

    Random random = new Random();
    Integer num_temp = random.nextInt(11);

    public Game(){
        number = num_temp;
    }

    public Game(int number){
        this.number=number;
    }

    public boolean check(int i) {
        return i == number;
    }
}
