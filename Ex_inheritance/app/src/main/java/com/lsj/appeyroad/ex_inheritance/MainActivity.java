package com.lsj.appeyroad.ex_inheritance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText) findViewById(R.id.input1);
        final EditText editText2 = (EditText) findViewById(R.id.input2);
        Button button1 = (Button) findViewById(R.id.click1);
        Button button2 = (Button) findViewById(R.id.click2);

        assert button1 != null;
        assert button2 != null;
        assert editText1 != null;
        assert editText2 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Singer singer = new Singer(editText1.getText().toString(), Integer.parseInt(editText2.getText().toString()));
                    Toast.makeText(MainActivity.this, singer.printText(), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "나이는 숫자입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    GirlGroupSinger girlGroupSinger = new GirlGroupSinger(editText1.getText().toString(), Integer.parseInt(editText2.getText().toString()));
                    Toast.makeText(MainActivity.this, girlGroupSinger.printText(), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "나이는 숫자입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
