package com.example.casarural;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button botonCliente;
    private Button botonEmpleado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        botonCliente = findViewById(R.id.buttonCliente);
        botonEmpleado = findViewById(R.id.buttonEmpleado);

        botonCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Cliente");
                openClientActivity();
            }
        });

        botonEmpleado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Empleado");
                openEmpleadoActivity();
            }
        });
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

    public void openClientActivity() {
        Intent intent = new Intent(this, ClientActivity.class);
        startActivity(intent);
    }

    public void openEmpleadoActivity() {
        Intent intent = new Intent(this, EmpleadoActivity.class);
        startActivity(intent);
    }
}
