package com.digitalconstruction.activitylifecycleexplorer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final String TAG = "LIFECYCLE";
	private TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		mTextView = (TextView) findViewById(R.id.textView1);
		mTextView.setText(mTextView.getText() + "onCreate ");
		Log.d(TAG, "onCreate");
	}

	@Override
	protected void onPause() {
		super.onPause();
		mTextView.setText(mTextView.getText() + "onPause ");
		Log.d(TAG, "onPause");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		mTextView.setText(mTextView.getText() + "onRestart ");
		Log.d(TAG, "onRestart");

	}

	@Override
	protected void onResume() {
		super.onResume();
		mTextView.setText(mTextView.getText() + "onResume ");
		Log.d(TAG, "onResume");
	}

	@Override
	protected void onStart() {
		super.onStart();
		mTextView.setText(mTextView.getText() + "onStart ");
		Log.d(TAG, "onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		mTextView.setText(mTextView.getText() + "onStop ");
		Log.d(TAG, "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mTextView.setText(mTextView.getText() + "onDestroy ");
		Log.d(TAG, "onDestroy");
	}
}
