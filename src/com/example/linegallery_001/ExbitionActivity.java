package com.example.linegallery_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ExbitionActivity extends Activity {
	
	int[] imageIDs = {
			R.drawable.ex_1, R.drawable.ex_2, R.drawable.ex_3, R.drawable.ex_4, R.drawable.ex_5, R.drawable.ex_6
	};
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exbition);
        Gallery exbition = (Gallery)findViewById(R.id.exbitionShow);
        BaseAdapter ba = new BaseAdapter() {

			public int getCount() {
				// TODO Auto-generated method stub
				return imageIDs.length;
			}

			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return position;
			}

			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return position;
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				ImageView iv = new ImageView (ExbitionActivity.this);
				iv.setImageResource(imageIDs[position]);
				iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
				iv.setLayoutParams(new Gallery.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT ));
				return iv;
			}
        	
        };
        exbition.setAdapter(ba);
        exbition.setOnItemClickListener(
        		new OnItemClickListener(){
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// TODO Auto-generated method stub
						Gallery exbition = (Gallery)findViewById(R.id.exbitionShow);
						exbition.setSelection(arg2);	
					}
        		        		
        		});     
        
        
        
        
        // Button Action
        
        ImageButton artistBtn = (ImageButton) findViewById(R.id.artistBtn);
        artistBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ExbitionActivity.this, ArtistActivity.class);
				ExbitionActivity.this.startActivity(intent);
				
			}
        });	
        
        ImageButton shopBtn = (ImageButton) findViewById(R.id.shopBtn);
        shopBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ExbitionActivity.this, ShopActivity.class);
				ExbitionActivity.this.startActivity(intent);
				
				
			}
		});
        
    }
	
}
