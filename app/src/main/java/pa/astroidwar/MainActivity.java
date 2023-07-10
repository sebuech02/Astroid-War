package pa.astroidwar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start_game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_game = findViewById(R.id.start_game);
        start_game.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.start_game){
            startActivity(new Intent(MainActivity.this, game_main.class));
        }

    }
}
