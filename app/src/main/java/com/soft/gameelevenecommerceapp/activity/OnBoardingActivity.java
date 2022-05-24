package com.soft.gameelevenecommerceapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.soft.gameelevenecommerceapp.MainActivity;
import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.util.PrefManager;

public class OnBoardingActivity extends AppCompatActivity {

    ViewPager mViewPager;
    private MyViewPageAdapter myViewPagerAdapter;
    private LinearLayout mDotsLayout;
    private TextView[] mDots;
    private int[] Layouts;
    private TextView btnNext;
    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mDotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        btnNext = findViewById(R.id.btn_Next);

        Layouts = new int[]{
                R.layout.onboarding_one,
                R.layout.onboarding_two,
                R.layout.onboarding_three};

        addBottomDots(0);

        myViewPagerAdapter = new MyViewPageAdapter();
        mViewPager.setAdapter(myViewPagerAdapter);
        mViewPager.addOnPageChangeListener(viewPagerPageChangeListener);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = getItem(+1);

                if (current < Layouts.length) {
                    mViewPager.setCurrentItem(current);
                } else {
                    launchHomeScreen();
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }

    private void addBottomDots(int currentPage) {
        mDots = new TextView[Layouts.length];

        int colorsActive = getResources().getColor(R.color.icon_selected);
        int colorInActive = getResources().getColor(R.color.text_color_gray);

        mDotsLayout.removeAllViews();
        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(colorInActive);
            mDotsLayout.addView(mDots[i]);
        }

        if (mDots.length > 0) {
            mDots[currentPage].setTextColor(colorsActive);
        }
    }

    private int getItem(int i) {
        return mViewPager.getCurrentItem() + i;
    }

    private void launchHomeScreen() {
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(OnBoardingActivity.this, MainActivity.class));
        finish();
    }

    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);

            //Changing the Next button text 'Next' / 'GOT iT'
            if (position == Layouts.length - 1) {
                // last page. make button text to GOT IT
                btnNext.setText(getString(R.string.skip));

            } else {
                // still page are left
                btnNext.setText(getString(R.string.skip));

            }
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    };

    public class MyViewPageAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public MyViewPageAdapter() {
        }


        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(Layouts[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return Layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
}