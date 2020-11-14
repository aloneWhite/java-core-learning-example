package org.core.base.string;

/**
 * @author AloneWhite
 * @date 2020-11-14 10:30:18
 *引用传递——使用包含string为属性的对象
 * 这里可以看到装箱拆箱的作用。
 *      装箱是将值类型转换为引用类型，拆箱是将引用类型转换为值类型。
 */
public class StringT2 {
    public static void main(String[] args) {
        StringObject stringObject = new StringObject();
        stringObject.setStr("123");
        strObjChange(stringObject);
        System.out.println(stringObject.getStr());
    }
    private static void strObjChange(StringObject stringObject){
        stringObject.setStr("456");
    }
}
class StringObject{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
