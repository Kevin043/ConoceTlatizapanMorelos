package mx.edu.utng.conocemorelos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TradicionesActivity extends AppCompatActivity {

    private Button btnSonido;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradiciones);

        btnSonido =  (Button) findViewById(R.id.btnSonido);
        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp == null){
                    mp = MediaPlayer.create(TradicionesActivity.this, R.raw.musica);
                }
                if (mp.isPlaying()){
                    mp.pause();
                }else{
                    mp.start();
                }

            }
        });
    }
}
