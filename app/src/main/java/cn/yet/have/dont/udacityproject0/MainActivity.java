package cn.yet.have.dont.udacityproject0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFirst(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "First Event Activated", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onSecond(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Second Event Activated", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onThird(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Third Event Activated", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onForth(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Fourth Event Activated", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onFifth(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Fifth Event Activated", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onSixth(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Sixth Event Activated", Toast.LENGTH_SHORT);
        toast.show();
    }
}
