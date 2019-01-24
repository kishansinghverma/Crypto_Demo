package com.example.crypto_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enc= "Evaxvn Xr Cncn";
                String str1= ((EditText)(findViewById(R.id.editText))).getText().toString();

                char[] str=enc.toCharArray();

                for(int i=0; i<str.length; i++)
                {
                    if(str[i]!=32)
                    {
                        if(str[i]>90)
                            str[i] =(char)((str[i]+13-97)%26 +97);

                        else
                            str[i] =(char)((str[i]+13-65)%26 +65);
                    }

                }
                String str2=new String(str);
                TextView tv = findViewById(R.id.textView4);
                if(str1.equals(str2)) {
                    tv.setVisibility(View.VISIBLE);
                    tv.setText("String Decrypted!");
                }
                else {
                    tv.setVisibility(View.VISIBLE);
                    tv.setText("Decryption Failed!");
                }


            }
        });

    }
}
