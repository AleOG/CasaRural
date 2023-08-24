package com.example.casarural;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cliente_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        // Called when the activity is becoming visible to the user.
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Called when the activity will start interacting with the user.
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Called when the activity is not visible to the user.
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Called when the activity is no longer visible to the user.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Called before the activity is destroyed.
    }
}
