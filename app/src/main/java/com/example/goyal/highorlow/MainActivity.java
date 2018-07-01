package com.example.goyal.highorlow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    Random random;
    int rand1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        random = new Random();
         rand1 = random.nextInt(101);
    }
    public void checkNumber (View view){
        String num = editText.getText().toString();
        Integer rand2 = Integer.parseInt(num);
        if(rand1 < rand2){
            Toast.makeText(this,"Go Low!",Toast.LENGTH_SHORT).show();
            editText.setText("");
            editText.setHint("TRY AGAIN");
        }
        if(rand1 > rand2){
            Toast.makeText(this,"Go High!",Toast.LENGTH_SHORT).show();
            editText.setText("");
            editText.setHint("TRY AGAIN");
        }
        if(rand1 == rand2){
            Toast.makeText(this,"Congrats! You made a correct guess",Toast.LENGTH_SHORT).show();
            editText.setText("");
            editText.setHint("PLAY AGAIN");
        }

    }
}
