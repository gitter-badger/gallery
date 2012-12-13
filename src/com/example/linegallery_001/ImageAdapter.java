package com.example.linegallery_001;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.Gallery.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	private Integer[] mThumbIds = {
			R.drawable.art_1, R.drawable.art_2, R.drawable.art_3, R.drawable.art_4, R.drawable.art_5,
			R.drawable.art_6, R.drawable.art_7, R.drawable.art_8, R.drawable.art_9, R.drawable.art_10,
			R.drawable.art_11, R.drawable.art_12, R.drawable.art_13, R.drawable.art_14, R.drawable.art_15		
	};
	private Integer[] descIds ={
			R.string.artist, R.string.artist, R.string.artist, R.string.artist, R.string.artist, 
			R.string.artist, R.string.artist, R.string.artist, R.string.artist, R.string.artist,
			R.string.artist, R.string.artist, R.string.artist, R.string.artist, R.string.artist,
		
	};
	
	public ImageAdapter(Context c) {
        mContext = c;
    }

	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		FrameLayout artFrame = new FrameLayout(mContext);
	    artFrame.setPadding(2, 2, 2, 2);
	
	    ImageView imageView = new ImageView(mContext);
		imageView.setLayoutParams(new FrameLayout.LayoutParams(LayoutParams.MATCH_PARENT, 250));
	    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imageView.setImageResource(mThumbIds[position]);		
		artFrame.addView(imageView);
		
		TextView textView = new TextView(mContext);
		textView.setText("“’ ıº“");
		textView.setLayoutParams(new FrameLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL));
		textView.setGravity(Gravity.CENTER);
		//textView.setPadding(3, 3 , 3, 3);
		textView.setBackgroundColor(mContext.getResources().getColor(R.color.grey));
		artFrame.addView(textView);		
				
		return artFrame;
			
	}

	private Object getResources() {
		// TODO Auto-generated method stub
		return null;
	}

}
