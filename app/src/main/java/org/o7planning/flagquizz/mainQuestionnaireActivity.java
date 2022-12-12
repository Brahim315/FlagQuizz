package org.o7planning.flagquizz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;

import android.os.Bundle;

public class mainQuestionnaireActivity extends AppCompatActivity {
    final String VILLE = "ville";


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_monquestionnaire);


        final Button reponse1 = (Button) findViewById(R.id.buttonRoll);

        final Button reponse2 = (Button) findViewById(R.id.buttonRoll2);

        final Button reponse3 = (Button) findViewById(R.id.buttonRoll3);
    }


    View.OnClickListener clickSurBouton1  = new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            Intent intent = new Intent(mainQuestionnaireActivity.this, reponse1Activity.class);

            intent.putExtra(VILLE, reponse1.getText().toString());

            startActivity(intent);



        }

    };

}
