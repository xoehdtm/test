package com.testa.sourcetree.sourcetree_test_a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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


    /*=============================================================================================
    소스트리 테스트

    test_a 수정_1

    test_b 수정_1_1

    test_a 수정 1_2

    test_a 수정 1_3

    test_b 수정 1_2

    test_b 수정 1_3

    test_b 수정 1_4

    test_a 수정 1_4

    test_a 수정 1_5

    test_b 수정 1_5

    test_b 수정 1_6

    test_a 수정 1_6

    test_a 수정 1_7
     */

    /*
    브런치 테스트
    branch_test_a  수정 1_1
    branch_test_a  수정 1_2

    branch_test_a  수정 1_3


     */

    //==============================================================================================
    //테스트2
    /*
    test_a 수정_2_1
    test_b 수정_2_1-->
    create branch_a_2
    branch_a_2 수정_1_1

     */

    /*
    //==============================================================================================
    //테스트3
    test_b 수정 3_1
    test_b 수정 3_2
    test_b 수정 3_3

     */







}

