package org.core.base.interfc;

import java.util.Arrays;

interface ProcessorInterface{
    String name();
    Object process(Object input);
}
class UpperCaseImpl implements ProcessorInterface{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class SplitCaseImpl implements ProcessorInterface{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
/**
 * @author AloneWhite
 * @date 2020-11-14 11:06:32
 * 使用接口，巩固思想
 */
public class ApplyInterfaceExample {
    public static void process(ProcessorInterface p,Object input){
        System.out.println(p.name());
        System.out.println(p.process(input));
    }
    public static String str = "This is a test for Interface";
    public static void main(String[] args) {
        process(new SplitCaseImpl(),str);
        process(new UpperCaseImpl(),str);
    }
}
