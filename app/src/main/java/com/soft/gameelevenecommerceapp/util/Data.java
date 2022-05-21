package com.soft.gameelevenecommerceapp.util;

import android.graphics.drawable.Drawable;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.model.BrandModel;
import com.soft.gameelevenecommerceapp.model.CartModel;
import com.soft.gameelevenecommerceapp.model.CategoryModel;
import com.soft.gameelevenecommerceapp.model.DailyFeaturesModel;
import com.soft.gameelevenecommerceapp.model.DealsModel;
import com.soft.gameelevenecommerceapp.model.HotCategoryModel;
import com.soft.gameelevenecommerceapp.model.OrderModel;
import com.soft.gameelevenecommerceapp.model.ProductModel;
import com.soft.gameelevenecommerceapp.model.SaleProductModel;
import com.soft.gameelevenecommerceapp.model.SubCategoryModel;
import com.soft.gameelevenecommerceapp.model.WishListModel;

import java.util.ArrayList;
import java.util.List;

public class Data {


    public List<WishListModel> getAllWishList() {
        List<WishListModel> list = new ArrayList<>();
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide2, "Hello dfdfdf", "45"));
        list.add(new WishListModel(R.drawable.slide3, "Hello fdsfdsfdsf", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello fdsfdf", "45"));
        list.add(new WishListModel(R.drawable.slide2, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide3, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));
        list.add(new WishListModel(R.drawable.slide1, "Hello", "45"));

        return list;
    }


    public List<CartModel> getAllCartList() {
        List<CartModel> list = new ArrayList<>();
        list.add(new CartModel(R.drawable.slide1, "Hello fsdfds", "45","200"));
        list.add(new CartModel(R.drawable.slide2, "Hello fdsfdsf", "45","200"));
        list.add(new CartModel(R.drawable.slide3, "Hello dfds", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide3, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));
        list.add(new CartModel(R.drawable.slide1, "Hello", "45","200"));

        return list;
    }


    public List<DealsModel> getAllDealsList() {
        List<DealsModel> list = new ArrayList<>();
        list.add(new DealsModel(1, R.drawable.deals1, "Shop Now"));
        list.add(new DealsModel(2,R.drawable.deals2, "Shop Now"));
        list.add(new DealsModel(3,R.drawable.deals3, "Shop Now"));
        list.add(new DealsModel(4,R.drawable.deals4, "Shop Now"));

        return list;
    }

    public List<DailyFeaturesModel> getAllDailyFeaturesList() {
        List<DailyFeaturesModel> list = new ArrayList<>();
        list.add(new DailyFeaturesModel(1, R.drawable.deals2, "550.00 SAR"));
        list.add(new DailyFeaturesModel(2,R.drawable.deals3, "1200.00 SAR"));
        list.add(new DailyFeaturesModel(3,R.drawable.deals4, "500.00 SAR"));

        return list;
    }

    public List<HotCategoryModel> getAllHotCategoriesList() {
        List<HotCategoryModel> list = new ArrayList<>();
        list.add(new HotCategoryModel(1, R.drawable.deals1, "G11 Chair"));
        list.add(new HotCategoryModel(2,R.drawable.deals2, "G11 Mouse"));
        list.add(new HotCategoryModel(3,R.drawable.deals3, "Gaming PC"));
        list.add(new HotCategoryModel(4,R.drawable.deals4, "G11 Headphone"));

        return list;
    }
    public List<BrandModel> getAllBrandModelList() {
        List<BrandModel> list = new ArrayList<>();
        list.add(new BrandModel(1, R.drawable.deals1, R.color.icon_selected));
        list.add(new BrandModel(2,R.drawable.deals2, R.color.icon_selected));
        list.add(new BrandModel(3,R.drawable.deals3, R.color.icon_selected));
        list.add(new BrandModel(4,R.drawable.deals4, R.color.icon_selected));

        return list;
    }

    public List<ProductModel> getAllProductList() {
        List<ProductModel> list = new ArrayList<>();
        list.add(new ProductModel(1, R.drawable.deals1, "Power Bank Water Gold Sound Box","500.00 SAR"));
        list.add(new ProductModel(2, R.drawable.deals2, "Power Bank Water Gold Sound Box","520.00 SAR"));
        list.add(new ProductModel(3, R.drawable.deals3, "Power Bank Water Gold Sound Box","1000.00 SAR"));
        list.add(new ProductModel(4, R.drawable.deals4, "Power Bank Water Gold Sound Box","1250.00 SAR"));
        list.add(new ProductModel(5, R.drawable.deals2, "Power Bank Water Gold Sound Box","300.00 SAR"));
        list.add(new ProductModel(6, R.drawable.deals1, "Power Bank Water Gold Sound Box","320.00 SAR"));
        list.add(new ProductModel(7, R.drawable.deals3, "Power Bank Water Gold Sound Box","124.00 SAR"));
        list.add(new ProductModel(8, R.drawable.deals2, "Power Bank Water Gold Sound Box","204.00 SAR"));
        list.add(new ProductModel(9, R.drawable.deals1, "Power Bank Water Gold Sound Box","852.00 SAR"));
        list.add(new ProductModel(10, R.drawable.deals4, "Power Bank Water Gold Sound Box","963.00 SAR"));

        return list;
    }


    public List<CategoryModel> getAllCategoriesList() {
        List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel(1, R.drawable.deals1, "Electronic Device"));
        list.add(new CategoryModel(2,R.drawable.deals2, "Furnitures Device"));
        list.add(new CategoryModel(3,R.drawable.deals3, "Casual ag"));
        list.add(new CategoryModel(4, R.drawable.deals1, "Electronic Device"));
        list.add(new CategoryModel(5,R.drawable.deals2, "Furnitures Device"));
        list.add(new CategoryModel(6, R.drawable.deals1, "Electronic Device"));
        list.add(new CategoryModel(7,R.drawable.deals2, "Furnitures Device"));
        list.add(new CategoryModel(8,R.drawable.deals3, "Casual ag"));
        list.add(new CategoryModel(9, R.drawable.deals1, "Electronic Device"));
        list.add(new CategoryModel(10,R.drawable.deals2, "Furnitures Device"));

        return list;
    }


    public List<SubCategoryModel> getAllSubCategoryList() {
        List<SubCategoryModel> list = new ArrayList<>();
        list.add(new SubCategoryModel(1,"Xbox", R.drawable.deals1, R.drawable.deals4,R.drawable.deals2));
        list.add(new SubCategoryModel(2,"Playstation 4", R.drawable.deals2, R.drawable.deals3,R.drawable.deals1));
        list.add(new SubCategoryModel(3,"Gaming Setup", R.drawable.deals3, R.drawable.deals2,R.drawable.deals4));
        list.add(new SubCategoryModel(4,"TV & Audio", R.drawable.deals4, R.drawable.deals1,R.drawable.deals2));
        list.add(new SubCategoryModel(5,"Merchandise", R.drawable.deals1, R.drawable.deals4,R.drawable.deals3));
        list.add(new SubCategoryModel(6,"Retro Gaming Consoles", R.drawable.deals2, R.drawable.deals3,R.drawable.deals4));
        list.add(new SubCategoryModel(7,"Pre Owned (Badel)", R.drawable.deals3, R.drawable.deals2,R.drawable.deals1));

        return list;
    }


    public List<OrderModel> getAllOrderList() {
        List<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel(1,"LML56373833", "XAF 50000.00", "DELIVERED","24 FEB,4:30 PM"));
        list.add(new OrderModel(1,"LML56373833", "XAF 50000.00", "DELIVERED","24 FEB,4:30 PM"));
        list.add(new OrderModel(1,"LML56373833", "XAF 50000.00", "DELIVERED","24 FEB,4:30 PM"));
        list.add(new OrderModel(1,"LML56373833", "XAF 50000.00", "DELIVERED","24 FEB,4:30 PM"));
        list.add(new OrderModel(1,"LML56373833", "XAF 50000.00", "DELIVERED","24 FEB,4:30 PM"));
        list.add(new OrderModel(1,"LML56373833", "XAF 50000.00", "DELIVERED","24 FEB,4:30 PM"));

        return list;
    }
}
