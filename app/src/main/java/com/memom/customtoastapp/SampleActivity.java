package com.memom.customtoastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.memom.customtoast.CustomToast;

/**
 *  Sample Activity to show custom toast message initialization
 */
public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        new CustomToast.Builder(this)
                .message("Hi memom")   /**  Pass message here **/
                .setBackgroundShape(R.drawable.memomshape) /** Optional:- design own shape in drawable  **/
                .setTextStyle(R.style.textStyleBold)  /** Optional:- design customize text style, text size, text color **/
                .setDrawableImage(R.drawable.ic_stat_name)   /** Optional:- pass icon from drawable**/
                .build();

    }
}
