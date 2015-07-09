package com.android.mario.itmovie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageBtn mImageBtnOK;
    private ImageBtn mImageBtnERROR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageBtnOK = (ImageBtn) findViewById(R.id.image_smile_btn);
        mImageBtnOK.setTextViewText("确定");
        mImageBtnOK.setImageRes(R.mipmap.smile_black);
        mImageBtnERROR = (ImageBtn) findViewById(R.id.image_sad_btn);
        mImageBtnERROR.setTextViewText("取消");
        mImageBtnERROR.setImageRes(R.mipmap.sad_black);
        mImageBtnOK.setOnClickListener(this);
        mImageBtnERROR.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_smile_btn:
                Toast.makeText(this,"确定",Toast.LENGTH_SHORT).show();
                mImageBtnOK.setImageRes(R.drawable.smile_img);
                break;
            case R.id.image_sad_btn:
                Toast.makeText(this,"取消",Toast.LENGTH_SHORT).show();
                mImageBtnERROR.setImageRes(R.drawable.sad_img);
                break;
        }
    }
}
