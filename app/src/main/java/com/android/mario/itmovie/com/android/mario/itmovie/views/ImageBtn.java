package com.android.mario.itmovie.com.android.mario.itmovie.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.mario.itmovie.R;

/**
 * Created by Administrator on 2015/7/8.
 */
public class ImageBtn extends LinearLayout {

    private ImageView mImageView;
    private TextView mTextView;
    public ImageBtn(Context context) {
        super(context);
    }

    public ImageBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.image_btn,this);
        mImageView = (ImageView) findViewById(R.id.iv_image);
        mTextView = (TextView) findViewById(R.id.tv_text);
    }

    public void setImageRes(int resId){
        mImageView.setImageResource(resId);
    }

    public void setTextViewText(String text){
        mTextView.setText(text);
    }
}
