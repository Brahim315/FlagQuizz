package org.o7planning.flagquizz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class reponse1Activity extends AppCompatActivity {
        final String VILLE = "ville";
        @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resultats);
            Intent intent = getIntent();

            String villeChoisie = intent.getStringExtra(VILLE);
            String resultat = "Mauvaise réponse !";

            if(villeChoisie.toLowerCase().equals("paris")){

                resultat = "Bonne réponse !";

            }
            TextView vueResultat = findViewById(R.id.textResultatQuestion);
            if(vueResultat != null){

                vueResultat.setText(resultat);

            }


        }
    }