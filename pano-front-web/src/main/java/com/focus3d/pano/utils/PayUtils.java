package com.focus3d.pano.utils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.focustech.common.utils.StringUtils;
/**
 *
 * *
 * @author lihaijun
 *
 */
public class PayUtils {
	/**
     * 将以元为单位的金额转换为以分为单位的值
     *
     * @param number 传入的以元为单位的金额值
     * @return
     */
    public static String convertYuan2Fen(BigDecimal number) {
        return convertYuan2Fen(number.toPlainString());
    }

    /**
     * 将以元为单位的金额转换为以分为单位的值
     *
     * @param number 传入的以元为单位的金额值
     * @return
     */
    public static String convertYuan2Fen(String number) {
        number = StringUtils.trim(number);
        if (StringUtils.isEmpty(number)) {
            return "0";
        }
        BigDecimal tmp = new BigDecimal(number).multiply(new BigDecimal(100));
        if (tmp.compareTo(new BigDecimal("0")) == -1) {
            throw new IllegalArgumentException("the money is valid!");
        }
        else if (tmp.compareTo(new BigDecimal("0")) == 0) {
            return "0";
        }
        String plainString = tmp.stripTrailingZeros().toPlainString();
        int length = plainString.length();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 12 - length; i ++){
        	sb.append("0");
        }
		return sb.toString() + plainString;
    }
    /**
     * 将以分为单位的金额转换为以元为单位的值
     *
     * @param number 传入的以分为单位的金额值
     * @return
     */
    public static String convertFen2Yuan(BigDecimal number) {
        return convertFen2Yuan(number.toPlainString());
    }

    /**
     * 将以分为单位的金额转换为以元为单位的值
     *
     * @param number 传入的以分为单位的金额值
     * @return
     */
    public static String convertFen2Yuan(String number) {
        number = StringUtils.trim(number);
        if (StringUtils.isEmpty(number)) {
            return "0";
        }
        BigDecimal d = new BigDecimal(number);
        d = d.divide(new BigDecimal(100));
        return d.stripTrailingZeros().toPlainString();
    }
    /**
     * 将日期转换为相应的支付日期格式。
     *
     * @param date 指定的日期
     * @return 返回为支付平台统一的日期格式
     */
    public static String formatPayDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String strDate = formatter.format(date);
        return strDate;
    }
    /**
     * 将日期转换为相应的支付日期格式。
     *
     * @param date 指定的日期
     * @return 返回为支付平台统一的日期格式
     */
    public static String formatPayDate() {
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
    	String strDate = formatter.format(new Date());
    	return strDate;
    }
    /**
     *
     * *
     * @param date
     * @return
     */
    public static Date formatPayDate(String date){
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
    	try {
			return formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
    }
    /**
     * 创建商户私有域
     * *
     * @param bankCode
     * @return
     */
    public static String createPriv1(String bankCode){
    	return bankCode + "#";
    }
    /**
     * 获取商户私有属性
     * *
     * @param privl
     * @param attr
     * @return
     */
    public static String getPriv1(String privl, String attr){
    	String[] split = privl.split("#");
    	if("bankCode".equals(attr)){
    		return split[0];
    	}
    	return "focus3D";
    }
}
