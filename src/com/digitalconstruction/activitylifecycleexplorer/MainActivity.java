package com.digitalconstruction.activitylifecycleexplorer;

import com.example.cardscrollviewexample.R;
import com.google.android.glass.app.VoiceTriggers;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final String TAG = "LIFECYCLE";
	private TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		mTextView = (TextView) findViewById(R.id.textView1);
		mTextView.setText(mTextView.getText() + "onCreate ");
		Log.d(TAG, "onCreate");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mTextView.setText(mTextView.getText() + "onPause ");
		Log.d(TAG, "onPause");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		mTextView.setText(mTextView.getText() + "onRestart ");
		Log.d(TAG, "onRestart");

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mTextView.setText(mTextView.getText() + "onResume ");
		Log.d(TAG, "onResume");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		mTextView.setText(mTextView.getText() + "onStart ");
		Log.d(TAG, "onStart");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		mTextView.setText(mTextView.getText() + "onStop ");
		Log.d(TAG, "onStop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mTextView.setText(mTextView.getText() + "onDestroy ");
		Log.d(TAG, "onDestroy");
	}
}
