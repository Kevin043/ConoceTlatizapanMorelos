package mx.edu.utng.conocemorelos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolba);


        //setSupportActionBar(toolbar);


        Button btn = (Button) findViewById(R.id.btnFb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), FacebookActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnBal = (Button) findViewById(R.id.btnBal);
        btnBal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BalneariosActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnMuse = (Button) findViewById(R.id.btnMuseo);
        btnMuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MuseoActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnHis = (Button) findViewById(R.id.btnHis);
        btnHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), HistoriaActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnGas = (Button) findViewById(R.id.btnGas);
        btnGas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GastronomiaActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnRes = (Button) findViewById(R.id.btnRest);
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), RestaurantActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnTrad = (Button) findViewById(R.id.btnTra);
        btnTrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), TradicionesActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
