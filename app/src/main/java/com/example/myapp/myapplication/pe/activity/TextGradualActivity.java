package com.example.myapp.myapplication.pe.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.myapp.myapplication.R;

public class TextGradualActivity extends BaseActivityA {
    private View mContentView, mLoadingView;
    private int mShortAnimationDuration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
    }

    @Override
    public int intiLayout() {
        return R.layout.activity_text_gradual;
    }

    @Override
    public void initView() {
        mContentView = findViewById(R.id.content);
        mLoadingView = findViewById(R.id.loading_spinner);
        // Initially hide the content view.
        mContentView.setVisibility(View.GONE);
        // Retrieve and cache the system's default "short" animation time.
        mShortAnimationDuration = getResources().getInteger(R.integer.time_2000);

    }

    @Override
    public void initData() {
        crossfade();

    }

    //动画淡入淡出
    private void crossfade() {
        // Set the content view to 0% opacity but visible, so that it is visible
        // (but fully transparent) during the animation.
        mContentView.setAlpha(0f);
        mContentView.setVisibility(View.VISIBLE);
        // Animate the content view to 100% opacity, and clear any animation
        // listener set on the view.
        mContentView.animate()
                .alpha(1f)
                .setDuration(mShortAnimationDuration)
                .setListener(null);
        // Animate the loading view to 0% opacity. After the animation ends,
        // set its visibility to GONE as an optimization step (it won't
        // participate in layout passes, etc.)
        mLoadingView.animate()
                .alpha(0f)
                .setDuration(mShortAnimationDuration)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        mLoadingView.setVisibility(View.GONE);
                    }
                });

    }
}
