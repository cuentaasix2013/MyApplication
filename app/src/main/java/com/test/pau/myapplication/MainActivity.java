package com.test.pau.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button  button2;
    private Button button;
    private TextView textView;
    private Boolean bool=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        button2=(Button) findViewById(R.id.button2);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bool) {
                    textView.setText("Clicao!");
                    bool=!bool;
                }else{
                    textView.setText("Hello World!");
                    bool=!bool;
                }
            }
         });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buton2(View view) {
        Toast t= Toast.makeText(this,"Cheee",Toast.LENGTH_SHORT);
        t.show();
    }
}
