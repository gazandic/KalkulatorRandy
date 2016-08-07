package fawwaz.github.com.kalkulatorrandy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText tonase_1_text;
    EditText tonase_2_text;
    EditText tonase_3_text;
    EditText tonase_4_text;
    EditText tonase_5_text;
    EditText vm_1_text;
    EditText vm_2_text;
    EditText vm_3_text;
    EditText vm_4_text;
    EditText vm_5_text;
    EditText ts_1_text;
    EditText ts_2_text;
    EditText ts_3_text;
    EditText ts_4_text;
    EditText ts_5_text;
    EditText cv_1_text;
    EditText cv_2_text;
    EditText cv_3_text;
    EditText cv_4_text;
    EditText cv_5_text;

    EditText vm_blending_text;
    EditText ts_blending_text;
    EditText cv_blending_text;

    float tonase_1_float;
    float tonase_2_float;
    float tonase_3_float;
    float tonase_4_float;
    float tonase_5_float;
    float vm_1_float;
    float vm_2_float;
    float vm_3_float;
    float vm_4_float;
    float vm_5_float;
    float ts_1_float;
    float ts_2_float;
    float ts_3_float;
    float ts_4_float;
    float ts_5_float;
    float cv_1_float;
    float cv_2_float;
    float cv_3_float;
    float cv_4_float;
    float cv_5_float;

    float vm_blending_float;
    float ts_blending_float;
    float cv_blending_float;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponent();
    }

    private void initializeComponent(){
        tonase_1_text = (EditText) findViewById(R.id.editText1);
        tonase_2_text = (EditText) findViewById(R.id.editText2);
        tonase_3_text = (EditText) findViewById(R.id.editText3);
        tonase_4_text = (EditText) findViewById(R.id.editText4);
        tonase_5_text = (EditText) findViewById(R.id.editText5);

        vm_1_text = (EditText) findViewById(R.id.editText6);
        vm_2_text = (EditText) findViewById(R.id.editText7);
        vm_3_text = (EditText) findViewById(R.id.editText8);
        vm_4_text = (EditText) findViewById(R.id.editText9);
        vm_5_text = (EditText) findViewById(R.id.editText10);

        ts_1_text = (EditText) findViewById(R.id.editText11);
        ts_2_text = (EditText) findViewById(R.id.editText12);
        ts_3_text = (EditText) findViewById(R.id.editText13);
        ts_4_text = (EditText) findViewById(R.id.editText14);
        ts_5_text = (EditText) findViewById(R.id.editText15);

        cv_1_text = (EditText) findViewById(R.id.editText16);
        cv_2_text = (EditText) findViewById(R.id.editText17);
        cv_3_text = (EditText) findViewById(R.id.editText18);
        cv_4_text = (EditText) findViewById(R.id.editText19);
        cv_5_text = (EditText) findViewById(R.id.editText20);

        vm_blending_text = (EditText) findViewById(R.id.editText21);
        ts_blending_text = (EditText) findViewById(R.id.editText22);
        cv_blending_text = (EditText) findViewById(R.id.editText23);

        tonase_1_text.setText("1");
        tonase_2_text.setText("1");
        tonase_3_text.setText("1");
        tonase_4_text.setText("1");
        tonase_5_text.setText("1");
        vm_1_text.setText("0");
        vm_2_text.setText("0");
        vm_3_text.setText("0");
        vm_4_text.setText("0");
        vm_5_text.setText("0");
        ts_1_text.setText("0");
        ts_2_text.setText("0");
        ts_3_text.setText("0");
        ts_4_text.setText("0");
        ts_5_text.setText("0");
        cv_1_text.setText("0");
        cv_2_text.setText("0");
        cv_3_text.setText("0");
        cv_4_text.setText("0");
        cv_5_text.setText("0");
        vm_blending_text.setText("0");
        ts_blending_text.setText("0");
        cv_blending_text.setText("0");

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("TEST","Diklik kok");
                tonase_1_float = Float.valueOf(tonase_1_text.getText().toString());
                tonase_2_float = Float.valueOf(tonase_2_text.getText().toString());
                tonase_3_float = Float.valueOf(tonase_3_text.getText().toString());
                tonase_4_float = Float.valueOf(tonase_4_text.getText().toString());
                tonase_5_float = Float.valueOf(tonase_5_text.getText().toString());
                vm_1_float = Float.valueOf(vm_1_text.getText().toString());
                vm_2_float = Float.valueOf(vm_2_text.getText().toString());
                vm_3_float = Float.valueOf(vm_3_text.getText().toString());
                vm_4_float = Float.valueOf(vm_4_text.getText().toString());
                vm_5_float = Float.valueOf(vm_5_text.getText().toString());
                ts_1_float = Float.valueOf(ts_1_text.getText().toString());
                ts_2_float = Float.valueOf(ts_2_text.getText().toString());
                ts_3_float = Float.valueOf(ts_3_text.getText().toString());
                ts_4_float = Float.valueOf(ts_4_text.getText().toString());
                ts_5_float = Float.valueOf(ts_5_text.getText().toString());
                cv_1_float = Float.valueOf(cv_1_text.getText().toString());
                cv_2_float = Float.valueOf(cv_2_text.getText().toString());
                cv_3_float = Float.valueOf(cv_3_text.getText().toString());
                cv_4_float = Float.valueOf(cv_4_text.getText().toString());
                cv_5_float = Float.valueOf(cv_5_text.getText().toString());

                float total_tonase = tonase_1_float + tonase_2_float + tonase_3_float + tonase_4_float + tonase_5_float;
                float vm_blending = vm_1_float * tonase_1_float + vm_2_float * tonase_2_float + vm_3_float * tonase_3_float + vm_4_float * tonase_4_float + vm_5_float * tonase_5_float;
                float ts_blending = ts_1_float * tonase_1_float + ts_2_float * tonase_2_float + ts_3_float * tonase_3_float + ts_4_float * tonase_4_float + ts_5_float * tonase_5_float;
                float cv_blending = cv_1_float * tonase_1_float + cv_2_float * tonase_2_float + cv_3_float * tonase_3_float + cv_4_float * tonase_4_float + cv_5_float * tonase_5_float;

                vm_blending_float = vm_blending / total_tonase;
                ts_blending_float = ts_blending / total_tonase;
                cv_blending_float = cv_blending / total_tonase;

                Log.d("TEST","vm blending : "+vm_blending_float);
                Log.d("TEST","ts blending : "+ts_blending_float);
                Log.d("TEST","cv blending : "+cv_blending_float);

                vm_blending_text.setText(String.valueOf(vm_blending_float));
                ts_blending_text.setText(String.valueOf(ts_blending_float));
                cv_blending_text.setText(String.valueOf(cv_blending_float));
            }
        });
        Log.d("TEST","finished initializing");
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

