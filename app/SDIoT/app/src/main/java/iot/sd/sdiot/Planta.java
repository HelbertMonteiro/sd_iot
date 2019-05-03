package iot.sd.sdiot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Planta extends AppCompatActivity {

    private ImageView sala, suite, quarto, garagem, cozinha, banheiro_suite, banheiro_social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planta);

        sala            = (ImageView) findViewById(R.id.sala);
        suite           = (ImageView) findViewById(R.id.suite);
        quarto          = (ImageView) findViewById(R.id.quarto);
        garagem         = (ImageView) findViewById(R.id.garagem);
        cozinha         = (ImageView) findViewById(R.id.cozinha);
        banheiro_social = (ImageView) findViewById(R.id.banheiro_social);
        banheiro_suite  = (ImageView) findViewById(R.id.banheiro_suite);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_sala:
                suite          .setVisibility(View.GONE);
                quarto         .setVisibility(View.GONE);
                garagem        .setVisibility(View.GONE);
                cozinha        .setVisibility(View.GONE);
                banheiro_suite .setVisibility(View.GONE);
                banheiro_social.setVisibility(View.GONE);

                if(sala.getVisibility() == View.VISIBLE){
                    sala.setVisibility(View.GONE);
                }else{
                    sala.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.menu_suite:
                sala           .setVisibility(View.GONE);
                quarto         .setVisibility(View.GONE);
                garagem        .setVisibility(View.GONE);
                cozinha        .setVisibility(View.GONE);
                banheiro_suite .setVisibility(View.GONE);
                banheiro_social.setVisibility(View.GONE);

                if(suite.getVisibility() == View.VISIBLE){
                    suite.setVisibility(View.GONE);
                }else {
                    suite.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.menu_quarto:
                sala           .setVisibility(View.GONE);
                suite          .setVisibility(View.GONE);
                garagem        .setVisibility(View.GONE);
                cozinha        .setVisibility(View.GONE);
                banheiro_suite .setVisibility(View.GONE);
                banheiro_social.setVisibility(View.GONE);

                if(quarto.getVisibility() == View.VISIBLE){
                    quarto.setVisibility(View.GONE);
                }else{
                    quarto.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.menu_garagem:
                sala           .setVisibility(View.GONE);
                quarto         .setVisibility(View.GONE);
                suite          .setVisibility(View.GONE);
                cozinha        .setVisibility(View.GONE);
                banheiro_suite .setVisibility(View.GONE);
                banheiro_social.setVisibility(View.GONE);

                if(garagem.getVisibility() == View.VISIBLE){
                    garagem.setVisibility(View.GONE);
                }else {
                    garagem.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.menu_cozinha:
                sala           .setVisibility(View.GONE);
                quarto         .setVisibility(View.GONE);
                garagem        .setVisibility(View.GONE);
                suite          .setVisibility(View.GONE);
                banheiro_suite .setVisibility(View.GONE);
                banheiro_social.setVisibility(View.GONE);

                if(cozinha.getVisibility() == View.VISIBLE){
                    cozinha.setVisibility(View.GONE);
                }else {
                    cozinha.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.menu_bso:
                sala           .setVisibility(View.GONE);
                quarto         .setVisibility(View.GONE);
                garagem        .setVisibility(View.GONE);
                cozinha        .setVisibility(View.GONE);
                banheiro_suite .setVisibility(View.GONE);
                suite          .setVisibility(View.GONE);

                if(banheiro_social.getVisibility() == View.VISIBLE){
                    banheiro_social.setVisibility(View.GONE);
                }else{
                    banheiro_social.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.menu_bsu:
                sala           .setVisibility(View.GONE);
                quarto         .setVisibility(View.GONE);
                garagem        .setVisibility(View.GONE);
                cozinha        .setVisibility(View.GONE);
                suite          .setVisibility(View.GONE);
                banheiro_social.setVisibility(View.GONE);

                if(banheiro_suite.getVisibility() == View.VISIBLE){
                    banheiro_suite.setVisibility(View.GONE);
                }else {
                    banheiro_suite.setVisibility(View.VISIBLE);
                }
                break;
        }

        return true;
    }
}
