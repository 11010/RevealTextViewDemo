package bodor.com.revealtextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.antonionicolaspina.revealtextview.RevealTextView;

public class MainActivity extends AppCompatActivity {
    private RevealTextView revealTextView;
    private ViewGroup layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        revealTextView = (RevealTextView) findViewById(R.id.revealTextView);
        revealTextView.setText("hahahahahahhahahah ");

    }
}
