package com.full.cn.utils;

public class DataUtils {

    public static void main(String[] args) {
        String str = "2000";
        long mss = Long.parseLong(str);
        long minutes = (mss % ( 60 * 60)) /60;  //分钟
        long seconds = mss % 60;   //秒
        long hours = (mss % ( 60 * 60 * 24)) / (60 * 60); //小时
        long days = mss / ( 60 * 60 * 24); //天
        String data = hours+"时"+minutes+"分"+seconds+"秒";
        System.out.println(data);

    }
}
