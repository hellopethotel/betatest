package com.pethotel.betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PetTrainingActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userN2, phoneN2, petN2;
    RadioGroup petT2, serviceT2;
    Button conf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_training);

        userN2 = (EditText) findViewById(R.id.username2);
        phoneN2 = (EditText) findViewById(R.id.phone2);
        petN2 = (EditText) findViewById(R.id.petname2);
        petT2 = (RadioGroup) findViewById(R.id.pettype2);
        serviceT2 = (RadioGroup) findViewById(R.id.servicetype2);
        conf2 = (Button) findViewById(R.id.confirm2);

        conf2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userVal2 = userN2.getText().toString();
        String phoneVal2 = phoneN2.getText().toString();
        String petVal2 = petN2.getText().toString();
        String petTp2 = ((RadioButton)findViewById(petT2.getCheckedRadioButtonId())).getText().toString();
        String serviceTp2 = ((RadioButton)findViewById(serviceT2.getCheckedRadioButtonId())).getText().toString();

        Intent intentTreatment = new Intent(this, TreatmentHome.class);

        intentTreatment.putExtra("userN2x", userVal2);
        intentTreatment.putExtra("phoneN2x", phoneVal2);
        intentTreatment.putExtra("petN2x", petVal2);
        intentTreatment.putExtra("petT2x", petTp2);
        intentTreatment.putExtra("serviceT2x", serviceTp2);
        startActivity(intentTreatment);
        finish();
    }
}
