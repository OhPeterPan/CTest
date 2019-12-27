package com.example.c.bean;

public class EntryUtils {

    public static native String getStringC();

    public static native String encode(String content);//加密

    public static native String decode(String content);//解密

    public static String encrypy(String key, String plainText) {

        //这里写加密的具体实现
        //原来只是将key放入到c代码中，然后使用类似于反射获取加密的key和原文本
        //这样只是可以防止被反编译拿到key，但是key还是可以打印出来.....脱裤子放屁了有点，算了，就当测试了



        return "这是个什么鬼";
    }

}
