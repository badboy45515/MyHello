package my.edu.tarc.myhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display UI
        setContentView(R.layout.activity_main);

        textViewMessage =
                (TextView)findViewById(
                        R.id.TextViewMessage);

        textViewMessage.setText("");
    }

    public void showMessage(View v){
        textViewMessage.setText(getText(R.string.message));
    }
}
