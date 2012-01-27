package com.nolanlawson.catlogcaller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CatlogCallerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(android.R.id.button1);
        final EditText filterText = (EditText) findViewById(android.R.id.text1);
        final EditText levelText = (EditText) findViewById(android.R.id.text2);
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent("com.nolanlawson.logcat.intents.LAUNCH");
				
				intent.putExtra("filter", filterText.getText().toString());
				intent.putExtra("level", levelText.getText().toString());
				
				startActivity(intent);
				
			}
		});
    }
}