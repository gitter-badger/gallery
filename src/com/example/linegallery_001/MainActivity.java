package com.example.linegallery_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logo = (ImageView)findViewById(R.id.logo);
        Animation logo_anim = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        
        logo.startAnimation(logo_anim);
        logo_anim.setAnimationListener(new AnimationListener()
        		{

					public void onAnimationEnd(Animation animation) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(MainActivity.this, ExbitionActivity.class);
						MainActivity.this.startActivity(intent);
						MainActivity.this.finish();
						
					}

					public void onAnimationRepeat(Animation animation) {
						// TODO Auto-generated method stub
						
					}

					public void onAnimationStart(Animation animation) {
						// TODO Auto-generated method stub
						
					}
        	
        		}); 	
     
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
