package com.yahoo.semsearch.fastlinking.zh;

/**
 * Created by freiheiter on 2017/5/13.
 */
public class test {
    public static void main(String[] args) {
//        CharSequence cs = "%E4%B8";
//        String str = CharSeq2Str(cs);
//        System.out.println(str);

        String string = "中国人" ;
        String [] stringArr = str2StrArr(string);
        System.out.println(stringArr);

    }
    public static String CharSeq2Str(CharSequence charSequence){
        final StringBuilder sb = new StringBuilder(charSequence.length());
        sb.append(charSequence);
        return sb.toString();
    }

    /**
     *  字符转字符数组
     * @param str
     * @return
     */
    public static String[] str2StrArr(String str){
        char [] charArr = str.toCharArray();
        String [] strArr = new String[charArr.length];
        for (int i=0; i<charArr.length; i++){
            strArr[i] = String.valueOf(charArr[i]);
        }
        return strArr;
    }
}
