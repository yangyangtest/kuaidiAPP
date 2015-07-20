package com.example.yangjuan.myapplicationfortest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button buttest = (Button) findViewById(R.id.buttonid) ;
//        buttest.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                EditText edittext = (EditText) findViewById(R.id.ed);
//                edittext.setText("button result");
//            }
//        });
    }
    public void onClick(View view)
    {
//        startActivity(new Intent("com.litreily.SecondActivity"));
        Intent intent = new Intent( MainActivity.this, SecondActivity.class);
        intent.putExtra("the second", "the second");
        startActivity(intent);
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
}


