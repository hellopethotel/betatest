package com.pethotel.betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PetCareActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userN1, phoneN1, petN1;
    RadioGroup petT1, serviceT1;
    Button conf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_care);

        userN1 = (EditText) findViewById(R.id.username1);
        phoneN1 = (EditText) findViewById(R.id.phone1);
        petN1 = (EditText) findViewById(R.id.petname1);
        petT1 = (RadioGroup) findViewById(R.id.pettype1);
        serviceT1 = (RadioGroup) findViewById(R.id.servicetype1);
        conf1 = (Button) findViewById(R.id.confirm1);

        conf1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userVal1 = userN1.getText().toString();
        String phoneVal1 = phoneN1.getText().toString();
        String petVal1 = petN1.getText().toString();
        String petTp1 = ((RadioButton)findViewById(petT1.getCheckedRadioButtonId())).getText().toString();
        String serviceTp1 = ((RadioButton)findViewById(serviceT1.getCheckedRadioButtonId())).getText().toString();

        Intent intentCare = new Intent(this, CareHome.class);

        intentCare.putExtra("userN1x", userVal1);
        intentCare.putExtra("phoneN1x", phoneVal1);
        intentCare.putExtra("petN1x", petVal1);
        intentCare.putExtra("petT1x", petTp1);
        intentCare.putExtra("serviceT1x", serviceTp1);
        startActivity(intentCare);
        finish();
    }
}
