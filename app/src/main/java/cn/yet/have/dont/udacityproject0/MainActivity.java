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

    public void showToast(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onFirst(View view) {
        showToast("First Event Activated");
    }

    public void onSecond(View view) {
        showToast("Second Event Activated");
    }

    public void onThird(View view) {
        showToast("Third Event Activated");
    }

    public void onForth(View view) {
        showToast("Fourth Event Activated");
    }

    public void onFifth(View view) {
        showToast("Fifth Event Activated");
    }

    public void onSixth(View view) {
        showToast("Sixth Event Activated");
    }
}
