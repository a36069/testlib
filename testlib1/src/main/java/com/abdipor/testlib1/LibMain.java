package com.abdipor.testlib1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class LibMain extends LinearLayout {
    public LibMain(Context context) {
        super(context);
        initialize(context);
    }

    public LibMain(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }
    private void initialize(Context context){
        inflate(context, R.layout.la_te, this);

    }
}
