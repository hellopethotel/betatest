package com.pethotel.betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CareHome extends AppCompatActivity implements View.OnClickListener {

    TextView userNHS1, phoneNHS1, petNHS1, petTHS1, serviceTHS1;
    Button hm1, edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_home);

        hm1 = (Button) findViewById(R.id.home);
        hm1.setOnClickListener(this);

        edt1 = (Button) findViewById(R.id.edit);
        edt1.setOnClickListener(this);

        Intent intentCare = getIntent();
        userNHS1 = (TextView) findViewById(R.id.userNH1);
        userNHS1.setText(getIntent().getStringExtra("userN1x"));
        phoneNHS1 = (TextView) findViewById(R.id.phoneNH1);
        phoneNHS1.setText(getIntent().getStringExtra("phoneN1x"));
        petNHS1 = (TextView) findViewById(R.id.petNH1);
        petNHS1.setText(getIntent().getStringExtra("petN1x"));
        petTHS1 = (TextView) findViewById(R.id.petTH1);
        petTHS1.setText(getIntent().getStringExtra("petT1x"));
        serviceTHS1 = (TextView) findViewById(R.id.serviceTH1);
        serviceTHS1.setText(getIntent().getStringExtra("serviceT1x"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.home):
                Intent intentHm1 = new Intent(this, Home.class);
                startActivity(intentHm1);
                finish();
                Toast.makeText(CareHome.this, "Your booking is successful!", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.edit):
                Intent intentEdt1 = new Intent(this, PetCareActivity.class);
                startActivity(intentEdt1);
                finish();
                break;
        }
    }
}
