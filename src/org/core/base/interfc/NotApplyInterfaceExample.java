package org.core.base.interfc;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author AloneWhite
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}
class UpperCase extends Processor{
    @Override
    Object process(Object input){return ((String)input).toUpperCase();}
}
class SplitCase extends Processor{
    @Override
    Object process(Object input){return Arrays.toString(((String) input).split(" "));}
}
public class NotApplyInterfaceExample {
    public static void process(Processor p, Object input){
        System.out.println("调用对象名："+p.name());
        System.out.println(p.process(input));
    }
    public static String str = "This is a test";
    public static void main(String[] args) {
        process(new UpperCase(),str);
        process(new SplitCase(),str);
    }
}
