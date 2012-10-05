package xyz.devfest.hellomap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnMap;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnMap = (Button) findViewById(R.id.button1);
		btnMap.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						HelloMapActivity.class));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
