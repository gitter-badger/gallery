package com.example.linegallery_001;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
public class ArtistActivity extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.artist);
		
		GridView artistList = (GridView) findViewById(R.id.artistList);
		artistList.setAdapter(new ImageAdapter(this));
		
  //button action
  // haha
  //jsjs
        
        ImageButton exbitionBtn = (ImageButton) findViewById(R.id.exbitionBtn);
        exbitionBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ArtistActivity.this, ExbitionActivity.class);
				ArtistActivity.this.startActivity(intent);
							
			}
		});       
        ImageButton shopBtn = (ImageButton) findViewById(R.id.shopBtn);
        shopBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ArtistActivity.this, ShopActivity.class);
				ArtistActivity.this.startActivity(intent);
				
			}
        });	
		     
		
	}
	

}
