package com.example.tomaszek.foodclicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class PiramidActivity extends AppCompatActivity {

    boolean btnOwoce_enabled = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramid);


        final ImageButton btnOwoce = (ImageButton) findViewById(R.id.btnOwoce1);


        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnOwoceIcon = getApplicationContext().getResources().getDrawable(R.drawable.ananas);
                Drawable grayedIcon = convertDrawableToGrayScale(btnOwoceIcon);
                if (btnOwoce_enabled) {
                    btnOwoce.setImageDrawable(grayedIcon);
                    btnOwoce_enabled = false;
                } else {
                    btnOwoceIcon.clearColorFilter();
                    btnOwoce.setImageDrawable(btnOwoceIcon);
                    btnOwoce_enabled = true;
                }

            }
        });

    }


    /**
     * Mutates and applies a filter that converts the given drawable to a Gray
     * image. This method may be used to simulate the color of disable icons in
     * Honeycomb's ActionBar.
     *
     * @return a mutated version of the given drawable with a color filter applied.
     */
    public static Drawable convertDrawableToGrayScale(Drawable drawable) {
        if (drawable == null)
            return null;

        Drawable res = drawable.mutate();
        //res.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
        res.setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
        return res;
    }

    /**
     * Sets the image button to the given state and grays-out the icon.
     *
     * @param enabled   The state of the button
     * @param item      The button item to modify
     * @param iconResId The button's icon ID
     */
    public static void setImageButtonEnabled(Context ctxt, boolean enabled,
                                             ImageButton item, int iconResId) {

        item.setEnabled(enabled);
        Drawable originalIcon = ctxt.getResources().getDrawable(iconResId);
        Drawable icon = enabled ? originalIcon : convertDrawableToGrayScale(originalIcon);
        item.setImageDrawable(icon);
    }


}
