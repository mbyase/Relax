package com.ustory.relax_business_component.imageloader

import android.support.annotation.DrawableRes
import android.widget.ImageView

interface ILoader {

    /**
     * 加载网络图片
     */
    fun loadImage(view: ImageView, httpUrl: String)

    /**
     * 加载网络图片，可以设置占位图
     */
    fun loadImage(view: ImageView, httpUrl: String, @DrawableRes defaultImage: Int)

    /**
     * 加载本地图片
     */
    fun loadImage(view: ImageView,@DrawableRes nativeResId : Int)
}
