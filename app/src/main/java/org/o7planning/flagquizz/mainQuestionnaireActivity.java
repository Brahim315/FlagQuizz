package org.o7planning.flagquizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class mainQuestionnaireActivity extends AppCompatActivity {
    final String VILLE = "ville";


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button reponse1 = (Button) findViewById(R.id.buttonRoll1);

        final Button reponse2 = (Button) findViewById(R.id.buttonRoll2);

        final Button reponse3 = (Button) findViewById(R.id.buttonRoll3);



    View.OnClickListener clickSurBouton1  = new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            Intent intent = new Intent(mainQuestionnaireActivity.this, reponse1Activity.class);

            intent.putExtra(VILLE, reponse1.getText().toString());

            startActivity(intent);





        }

    };
    View.OnClickListener clickSurBouton2  = new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            Intent intent = new Intent(mainQuestionnaireActivity.this, reponse1Activity.class);

            intent.putExtra(VILLE, reponse2.getText().toString());

            startActivity(intent);




        }

    };
    View.OnClickListener clickSurBouton3  = new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            Intent intent = new Intent(mainQuestionnaireActivity.this, reponse1Activity.class);

            intent.putExtra(VILLE, reponse3.getText().toString());

            startActivity(intent);




        }

    };
             reponse1.setOnClickListener(clickSurBouton1);

            reponse2.setOnClickListener(clickSurBouton2);

            reponse3.setOnClickListener(clickSurBouton3);

    }
}
