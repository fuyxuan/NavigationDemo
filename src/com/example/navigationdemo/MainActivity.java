package com.example.navigationdemo;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private DrawerLayout drawerLayout;
	private RelativeLayout leftLayout;
	private RelativeLayout rightLayout;
	private List<ContentModel> list;
	private ContentAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
		leftLayout=(RelativeLayout) findViewById(R.id.left);
		rightLayout=(RelativeLayout) findViewById(R.id.right);
		ListView listView=(ListView) leftLayout.findViewById(R.id.left_listview);
		
		initData();
		adapter=new ContentAdapter(this, list);
		listView.setAdapter(adapter);
	}

	private void initData() {
		list=new ArrayList<ContentModel>();
		
		list.add(new ContentModel(R.drawable.ic_launcher, "新聞"));
		list.add(new ContentModel(R.drawable.ic_launcher, "訂閱"));
		list.add(new ContentModel(R.drawable.ic_launcher, "圖片"));
		list.add(new ContentModel(R.drawable.ic_launcher, "視頻"));
		list.add(new ContentModel(R.drawable.ic_launcher, "跟帖"));
		list.add(new ContentModel(R.drawable.ic_launcher, "投票"));
	}

}