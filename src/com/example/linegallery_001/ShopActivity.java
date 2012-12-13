package com.example.linegallery_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class ShopActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shop);
		
		ListView cmdList = (ListView)findViewById(R.id.cmdList);
		cmdList.setAdapter(new CommodityAdapter(this));
	
		
// button action
        
        ImageButton exbitionBtn = (ImageButton) findViewById(R.id.exbitionBtn);
        exbitionBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ShopActivity.this, ExbitionActivity.class);
				ShopActivity.this.startActivity(intent);		
			}
		});
        
        ImageButton artistBtn = (ImageButton) findViewById(R.id.artistBtn);
        artistBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ShopActivity.this, ArtistActivity.class);
				ShopActivity.this.startActivity(intent);		
			}
		});
		
	}	

}
