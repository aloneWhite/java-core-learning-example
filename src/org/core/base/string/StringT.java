package org.core.base.string;


/**
 * @author AloneWhite
 * @date 2020-11-14 10:23:54
 * 值传递
 */
public class StringT {
    public static void main(String[] args) {
        String str = "123";
        strChange(str);
        System.out.println(str);
    }
    public static void strChange(String str){
        str = "456";
    }
}
