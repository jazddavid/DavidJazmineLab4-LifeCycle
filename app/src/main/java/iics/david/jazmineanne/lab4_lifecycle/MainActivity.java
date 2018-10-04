package iics.david.jazmineanne.lab4_lifecycle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "4ITI-Lab4", "OnCreate has been executed");

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "Unable to view previous image";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Unable to view next image";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });
    }
    public void showSnackbar(View view, String message, int duration){
        Snackbar.make(view, message, duration).show();
    }

    protected void onStart() {
        super.onStart();
        Log.d( "4ITI-Lab4", "OnStart has been executed");
    }
    protected void onResume() {
        super.onResume();
        Log.d( "4ITI-Lab4", "OnResume has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "4ITI-Lab4", "OnPause has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "4ITI-Lab4", "OnStop has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "4ITI-Lab4", "OnRestart has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "4ITI-Lab4", "Object is Allocated");
    }

}