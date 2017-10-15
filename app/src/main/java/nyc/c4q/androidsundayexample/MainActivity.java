package nyc.c4q.androidsundayexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;



public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    private TextView textWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logCheck("onCreate");
        textWidget=(TextView) findViewById(R.id.class_example_textview);
        textWidget.setText("Hello, Android Class");

    }
    public void logCheck(String tag){
        Log.d(TAG,tag + " logCheck");

    }
    @Override
    protected  void onStart()
    {
        super.onStart();
        Log.d(TAG," onStart");

    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG," onResume");
    }
   @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG," onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

}
