package com.pethotel.betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TreatmentHome extends AppCompatActivity implements View.OnClickListener {

    TextView userNHS2, phoneNHS2, petNHS2, petTHS2, serviceTHS2;
    Button hm2, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment_home);

        hm2 = (Button) findViewById(R.id.home);
        hm2.setOnClickListener(this);

        edt2 = (Button) findViewById(R.id.edit);
        edt2.setOnClickListener(this);

        Intent intentTreatment = getIntent();
        userNHS2 = (TextView) findViewById(R.id.userNH2);
        userNHS2.setText(getIntent().getStringExtra("userN2x"));
        phoneNHS2 = (TextView) findViewById(R.id.phoneNH2);
        phoneNHS2.setText(getIntent().getStringExtra("phoneN2x"));
        petNHS2 = (TextView) findViewById(R.id.petNH2);
        petNHS2.setText(getIntent().getStringExtra("petN2x"));
        petTHS2 = (TextView) findViewById(R.id.petTH2);
        petTHS2.setText(getIntent().getStringExtra("petT2x"));
        serviceTHS2 = (TextView) findViewById(R.id.serviceTH2);
        serviceTHS2.setText(getIntent().getStringExtra("serviceT2x"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.home):
                Intent intentHm2 = new Intent(this, Home.class);
                startActivity(intentHm2);
                finish();
                Toast.makeText(TreatmentHome.this, "Your booking is successful!", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.edit):
                Intent intentEdt2 = new Intent(this, PetTrainingActivity.class);
                startActivity(intentEdt2);
                finish();
                break;
        }
    }
}
