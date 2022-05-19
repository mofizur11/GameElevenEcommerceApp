package com.soft.gameelevenecommerceapp.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.adapter.BrandAdapter;
import com.soft.gameelevenecommerceapp.adapter.DailyFeaturesAdapter;
import com.soft.gameelevenecommerceapp.adapter.DealsAdapter;
import com.soft.gameelevenecommerceapp.adapter.HotCategoryAdapter;
import com.soft.gameelevenecommerceapp.adapter.ProductAdapter;
import com.soft.gameelevenecommerceapp.adapter.SliderAdapter;
import com.soft.gameelevenecommerceapp.util.Data;

import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    ImageButton drawerCategory;

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    Timer timer;
    int page_position = 0;
    Data data;
    private int dotscount;
    private ImageView[] dots;
    private RecyclerView flashDealsRV, dailyFeaturesRV, HotCategoriesRV, brandRV, productRV;
    private DealsAdapter dAdapter;
    private DailyFeaturesAdapter dFAdapter;
    private HotCategoryAdapter hCAdapter;
    private BrandAdapter brandAdapter;
    private ProductAdapter pAdapter;


    private Integer[] images = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};

    public HomeFragment() {
        //empty cons
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);






        data = new Data();


        flashDealsRV = view.findViewById(R.id.flash_deals_rv);
        dailyFeaturesRV = view.findViewById(R.id.daily_features_rv);
        HotCategoriesRV = view.findViewById(R.id.hot_category_rv);
        brandRV = view.findViewById(R.id.brand_rv);
        productRV = view.findViewById(R.id.product_rv);


        dAdapter = new DealsAdapter(data.getAllDealsList(), getContext());
        RecyclerView.LayoutManager dLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        flashDealsRV.setLayoutManager(dLayoutManager);
        flashDealsRV.setAdapter(dAdapter);


        dFAdapter = new DailyFeaturesAdapter(data.getAllDailyFeaturesList(), getContext());
        RecyclerView.LayoutManager dFLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        dailyFeaturesRV.setLayoutManager(dFLayoutManager);
        dailyFeaturesRV.setAdapter(dFAdapter);


        hCAdapter = new HotCategoryAdapter(data.getAllHotCategoriesList(), getContext());
        RecyclerView.LayoutManager hCLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        HotCategoriesRV.setLayoutManager(hCLayoutManager);
        HotCategoriesRV.setAdapter(hCAdapter);

        brandAdapter = new BrandAdapter(data.getAllBrandModelList(), getContext());
        RecyclerView.LayoutManager bLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        brandRV.setLayoutManager(bLayoutManager);
        brandRV.setAdapter(brandAdapter);

        pAdapter = new ProductAdapter(data.getAllProductList(), getContext());
        RecyclerView.LayoutManager pLayoutManager = new GridLayoutManager(getContext(), 2);
        productRV.setLayoutManager(pLayoutManager);
        productRV.setAdapter(pAdapter);


        timer = new Timer();
        viewPager = view.findViewById(R.id.viewPager);

        sliderDotspanel = view.findViewById(R.id.SliderDots);

        SliderAdapter viewPagerAdapter = new SliderAdapter(getContext(), images);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {

            dots[i] = new ImageView(getContext());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.non_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        scheduleSlider();

        drawerCategory = view.findViewById(R.id.drawer_category);
        drawerCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CategoryFragment(), null).commit();
            }
        });


        return view;
    }


    public void scheduleSlider() {

        final Handler handler = new Handler();

        final Runnable update = new Runnable() {
            public void run() {
                if (page_position == dotscount) {
                    page_position = 0;
                } else {
                    page_position = page_position + 1;
                }
                viewPager.setCurrentItem(page_position, true);
            }
        };

        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                handler.post(update);
            }
        }, 500, 4000);
    }

    @Override
    public void onStop() {
        timer.cancel();
        super.onStop();
    }

    @Override
    public void onPause() {
        timer.cancel();
        super.onPause();
    }

//    public void onLetsClicked(View view) {
//        startActivity(new Intent(getContext(), MainActivity.class));
//    }
}
