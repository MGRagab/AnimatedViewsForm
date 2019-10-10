package com.mgragab.animatedviewsform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mgragab.animatedviewsfrom.ViewIteration;
import com.mgragab.animatedviewsfrom.Views;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewGroup group1 = findViewById(R.id.group1);
        final ViewGroup group2 = findViewById(R.id.group2);

        List<View> views = Views.from(group1)
                .includingFromViews()
                .find();
        Toast.makeText(this, "Count : " + views.size(), Toast.LENGTH_LONG).show();

        Views.from(group1)
                .includingFromViews()
                .andFrom(group2)
                .forEach(new ViewIteration() {
                    @Override
                    public void onView(final View view, final int viewIndex, final int viewsCount) {
                        Log.i("ViewsFromLibExample", (viewIndex + 1) + " of " + viewsCount + " : " + view.getClass().getSimpleName());
                    }
                });

        Views.from(group1, group2)
                .withVisibility(View.VISIBLE)
                .includingFromViews()
                .animateWith(MainActivity.this, R.anim.fadein)
                .withDelayBetweenEachChild(250)
                .withViewsVisibilityBeforeAnimation(View.INVISIBLE)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        Log.i("ViewsFromLibExample", "It's finally over.");
                    }
                })
                .start();

    }
}
