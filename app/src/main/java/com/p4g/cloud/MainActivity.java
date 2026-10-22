package com.p4g.cloud;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        TextView tv = new TextView(this);
        tv.setText("P4G Cloud Builder OK\nTitle: PCSE00120");
        tv.setTextSize(20);
        setContentView(tv);
    }
}
