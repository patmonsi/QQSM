package upv.adm.qqsm;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bPlay = (Button) findViewById(R.id.playButton);
        bPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchGame(null);
            }
        });

        Button bSettings = (Button) findViewById(R.id.settingsButton);
        bSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchSettings(null);
            }
        });

        Button bScores = (Button) findViewById(R.id.scoresButton);
        bScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchScores(null);
            }
        });
    }


    private void launchGame(View view) {
        Intent i = new Intent(this, Play.class);
        startActivity(i);
    }

    private void launchSettings(View view) {
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
    }

    private void launchScores(View view) {
        Intent i = new Intent(this, Scores.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.menu_option1:
                Intent i = new Intent(this, Credits.class);
                this.startActivity(i);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;

    }


}
