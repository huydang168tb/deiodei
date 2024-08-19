package dev.dev7.example;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LdErrorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ld_error);

        // Get the error message from the intent
        String errorMessage = getIntent().getStringExtra("error_message");
        TextView errorTextView = findViewById(R.id.error_message);
        errorTextView.setText(errorMessage);

    }
}


