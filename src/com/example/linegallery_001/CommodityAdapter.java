package com.example.linegallery_001;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CommodityAdapter extends BaseAdapter {
	private Context mContext;
	private Integer[] mThumbIds = {
			R.drawable.art_1, R.drawable.art_2, R.drawable.art_3, R.drawable.art_4, R.drawable.art_5,
			R.drawable.art_6, R.drawable.art_7, R.drawable.art_8, R.drawable.art_9, R.drawable.art_10,
			R.drawable.art_11, R.drawable.art_12, R.drawable.art_13, R.drawable.art_14, R.drawable.art_15		
	};
	
	
	public CommodityAdapter(Context c) {
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
		
		RelativeLayout cmdFrame = new RelativeLayout(mContext);
		cmdFrame.setLayoutParams(new ListView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		
		//define the layout parameters
		RelativeLayout.LayoutParams layparam1 = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		layparam1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		
		RelativeLayout.LayoutParams layparam2 = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		layparam2.addRule(RelativeLayout.BELOW, 1001);
		
		RelativeLayout.LayoutParams layparam3 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		layparam3.addRule(RelativeLayout.ALIGN_LEFT);
		layparam3.addRule(RelativeLayout.BELOW, 1002);
		
	
		RelativeLayout.LayoutParams layparam4 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		layparam4.addRule(RelativeLayout.ALIGN_RIGHT);
		layparam4.addRule(RelativeLayout.BELOW, 1002);
		layparam4.addRule(RelativeLayout.RIGHT_OF, 1003);

		
		// create elements 
	    ImageView imageView = new ImageView(mContext);
	    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setImageResource(mThumbIds[position]);	
		imageView.setId(1001);
		
		TextView textView = new TextView(mContext);
		textView.setText("这里是关于商品的描述， 价格");
		textView.setId(1002);
		
		ImageButton buyBtn = new ImageButton(mContext);
		buyBtn.setImageResource(R.drawable.btn_buy);
		buyBtn.setId(1003);
		
		ImageButton shareBtn = new ImageButton(mContext);
		shareBtn.setImageResource(R.drawable.btn_share);
		shareBtn.setId(1004);
		
		//add view into the adaptor			
		cmdFrame.addView(imageView, layparam1);
		cmdFrame.addView(textView, layparam2);
		cmdFrame.addView(buyBtn, layparam3);
		cmdFrame.addView(shareBtn, layparam4);
				
		return cmdFrame;
			
	}

	private Object getResources() {
		// TODO Auto-generated method stub
		return null;
	}

}
