package com.infrastructure.activity;

import com.infrastructure.R;
import com.infrastructure.ui.SweetAlertDialog;
import com.infrastructure.utils.Utils;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
	String TAG = "MainActivity";
	Context m_context;
	TextView tvShow;
	ImageView iv;

	@Override
	public void initVariable() {
		m_context = this;
	}

	@Override
	public void initViews(Bundle savedInstanceState) {
		setContentView(R.layout.activity_main);
		tvShow = (TextView)findViewById(R.id.tvShow);
		tvShow.setText("当前屏幕的宽度是"+ String.valueOf( Utils.getScreenWidth( m_context) )
				+",高度是"+String.valueOf( Utils.getScreenHeight( m_context ) )
				+",屏幕密度是"+ String.valueOf( Utils.getScreenDensity( m_context ) ));

		iv = (ImageView)findViewById(R.id.iv);
		iv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Utils.showIOSDialog(m_context, "仿IOS对话框", "还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?还可以吧?");

			}
		});

	}

	@Override
	public void loadData() {

	}
}
