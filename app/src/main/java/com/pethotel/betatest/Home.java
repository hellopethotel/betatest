package com.pethotel.betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    ImageButton pet_care, pet_training, about_t, history_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pet_care = (ImageButton) findViewById(R.id.petCare);
        pet_training = (ImageButton) findViewById(R.id.petTraining);
        about_t = (ImageButton) findViewById(R.id.about);
        history_y = (ImageButton) findViewById(R.id.history);

        pet_care.setOnClickListener(this);
        pet_training.setOnClickListener(this);
        about_t.setOnClickListener(this);
        history_y.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.petCare):
                Intent intent1 = new Intent (this, PetCareActivity.class);
                startActivity(intent1);
                break;

            case (R.id.petTraining):
                Intent intent2 = new Intent (this, PetTrainingActivity.class);
                startActivity(intent2);
                break;

            case (R.id.about):
                Intent intent3 = new Intent (this, About.class);
                startActivity(intent3);
                break;

            case (R.id.history):
                Intent intent4 = new Intent(this, News.class);
                startActivity(intent4);
                break;
        }
    }
}
