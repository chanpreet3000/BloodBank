package com.example.bloodblank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    View developerChanpreetCard;
    View developerAyushCard;
    View developerAryanCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().hide();

        developerChanpreetCard = findViewById(R.id.developerChanpreetCard);
        developerAyushCard = findViewById(R.id.developerAyushCard);
        developerAryanCard = findViewById(R.id.developerAryanCard);

        ((TextView) developerChanpreetCard.findViewById(R.id.developerNameTextView)).setText("Chanpreet Singh");
        ((TextView) developerChanpreetCard.findViewById(R.id.developerEmailTextView)).setText("chanpreet3000@gmail.com");
        ((TextView) developerChanpreetCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9717461815");
        ((TextView) developerChanpreetCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("2020UCB6038");

        ((TextView) developerAyushCard.findViewById(R.id.developerNameTextView)).setText("Ayush Amawate");
        ((TextView) developerAyushCard.findViewById(R.id.developerEmailTextView)).setText("amawateayush@gmail.com");
        ((TextView) developerAyushCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9354611049");
        ((TextView) developerAyushCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("2020UCB6010");

        ((TextView) developerAryanCard.findViewById(R.id.developerNameTextView)).setText("Aryan Singh");
        ((TextView) developerAryanCard.findViewById(R.id.developerEmailTextView)).setText("Aryansinghnse@gmail.com");
        ((TextView) developerAryanCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 7003493598");
        ((TextView) developerAryanCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("2020UCB6053");
    }
}