package com.memom.customtoast;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

 class CustomUtils {
     static void buildToast(Activity context, String message, int backgroundShape, int drawableImageId, int style){
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.memomlayout,(ViewGroup) context.findViewById(R.id.memo));
        ImageView imageView = view.findViewById(R.id.img_view);
        TextView textMsg = view.findViewById(R.id.txt_msg);
        imageView.setImageResource(drawableImageId);
        textMsg.setText(message);
        if (style != 0) textMsg.setTextAppearance(context,style);else textMsg.setTextAppearance(context,R.style.textStyleBold);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        if (backgroundShape != 0) view.setBackgroundResource(backgroundShape); else view.setBackgroundResource(R.drawable.memomshape);
        toast.setView(view);
        toast.show();
    }
}
