package android.khalafl.crystalball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CrystalBall extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crystal_ball);

        answerText = (TextView) findViewById(R.id.answerText); //text view is a cast, changes what is being called
        answerText.setText("I am a ballof crystal, why are you asking me?");
    }

}
