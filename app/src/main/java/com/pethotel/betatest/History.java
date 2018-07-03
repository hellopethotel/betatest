package com.pethotel.betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class History extends AppCompatActivity implements View.OnClickListener{

    TextView userNHS1, phoneNHS1, petNHS1, petTHS1, serviceTHS1;
    TextView userNHS2, phoneNHS2, petNHS2, petTHS2, serviceTHS2;
    Button homeI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        homeI = (Button) findViewById(R.id.home);
        homeI.setOnClickListener(this);

        Intent intentCare = getIntent();
        userNHS1 = (TextView) findViewById(R.id.userNH1);
        userNHS1.setText(intentCare.getStringExtra("userN1x"));
        phoneNHS1 = (TextView) findViewById(R.id.phoneNH1);
        phoneNHS1.setText(intentCare.getStringExtra("phoneN1x"));
        petNHS1 = (TextView) findViewById(R.id.petNH1);
        petNHS1.setText(intentCare.getStringExtra("petN1x"));
        petTHS1 = (TextView) findViewById(R.id.petTH1);
        petTHS1.setText(intentCare.getStringExtra("petT1x"));
        serviceTHS1 = (TextView) findViewById(R.id.serviceTH1);
        serviceTHS1.setText(intentCare.getStringExtra("serviceT1x"));

        Intent intentTreatment = getIntent();
        userNHS2 = (TextView) findViewById(R.id.userNH2);
        userNHS2.setText(intentTreatment.getStringExtra("userN2x"));
        phoneNHS2 = (TextView) findViewById(R.id.phoneNH2);
        phoneNHS2.setText(intentTreatment.getStringExtra("phoneN2x"));
        petNHS2 = (TextView) findViewById(R.id.petNH2);
        petNHS2.setText(intentTreatment.getStringExtra("petN2x"));
        petTHS2 = (TextView) findViewById(R.id.petTH2);
        petTHS2.setText(intentTreatment.getStringExtra("petT2x"));
        serviceTHS2 = (TextView) findViewById(R.id.serviceTH2);
        serviceTHS2.setText(intentTreatment.getStringExtra("serviceT2x"));
    }

    @Override
    public void onClick(View v) {
        Intent intentHome = new Intent(this, Home.class);
        startActivity(intentHome);
    }
}
