package com.memom.customtoast;


import android.app.Activity;
import android.util.Log;

public class CustomToast {

    private Activity mActivity;
    private String message;
    private int backgroundShape;
    private int drawableImage;
    private int style;

    public static class Builder {
        private Activity mActivity;
        private String message;
        private int backgroundShape;
        private int drawableImage;
        private int style;

        public Builder(Activity activity) {
            this.mActivity = activity;
        }
        public Builder message(String message){
            this.message = message;
            return this;
        }
        public Builder setBackgroundShape(int shape){
            this.backgroundShape = shape;
            return this;
        }
        public Builder setDrawableImage(int image){
            this.drawableImage = image;
            return this;
        }
        public Builder setTextStyle(int style){
            this.style = style;
            return this;
        }
        public CustomToast build(){
            return new CustomToast(this);
        }
    }

     CustomToast(Builder builder) {
        mActivity = builder.mActivity;
        message = builder.message;
        backgroundShape = builder.backgroundShape;
        drawableImage = builder.drawableImage;
        style = builder.style;
        Log.d("test", "CustomToast: "+style);
        CustomUtils.buildToast(mActivity,message,backgroundShape,drawableImage,style);
    }
}

