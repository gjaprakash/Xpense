package com.defocs.xpense;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class UploadProfileActivity extends AppCompatActivity {

    CardView uploadProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_profile);

        uploadProfile = (CardView)findViewById(R.id.upload_profile);

        uploadProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CurrencyActivity.class);
                startActivity(intent);
            }
        });
    }
}
