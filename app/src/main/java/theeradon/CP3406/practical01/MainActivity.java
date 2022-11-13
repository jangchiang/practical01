package theeradon.CP3406.practical01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view){
        EditText userInput = findViewById(R.id.userInput);
        String text = userInput.getText().toString();
        int guess = Integer.parseInt(text);

        Toast toast = Toast.makeText(this, "It correct", Toast.LENGTH_LONG);

        if (!game.check(guess)){
            toast.setText("Incorrect...Just try again");
        }

        toast.show();
    }
}