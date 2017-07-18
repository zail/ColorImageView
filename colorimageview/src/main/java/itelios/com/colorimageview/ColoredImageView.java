package itelios.com.colorimageview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;

/**
 * Created by czaboitzeff on 18/07/2017.
 */

public class ColoredImageView extends android.support.v7.widget.AppCompatImageView {

    private int attributeColor;

    public ColoredImageView(Context context) {
        super(context);
    }

    public ColoredImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ColoredImageView, 0, 0);
        try {
            attributeColor = ta.getColor(R.styleable.ColoredImageView_imageColor, -1);
        } finally {
            ta.recycle();
        }
    }

    public ColoredImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ColoredImageView, 0, 0);
        try {
            attributeColor = ta.getColor(R.styleable.ColoredImageView_imageColor, -1);
        } finally {
            ta.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (attributeColor != -1) {
            Resources res = getContext().getResources();
            setColorFilter(attributeColor, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
