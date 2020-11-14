package org.core.base.copy;

class Family implements Cloneable {
    private String name;
    private Child child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    /**
     * @return 返回的是深拷贝的object
     */
    @Override
    public Object clone() throws CloneNotSupportedException {

        Family cloneFamily = (Family) super.clone();
        cloneFamily.child = (Child) this.child.clone();
        return cloneFamily;
    }
}

class Child implements Cloneable {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/**
 * @author AloneWhite
 *
 * 深拷贝和浅拷贝：
 * 浅拷贝理解为创建了一个指针，指向了对象
 * 深拷贝理解为创建了一个完全相同的实体对象。
 *
 * 要注意的是，如果一个对象(big)中包含了另一个对象(small)，对big进行拷贝时，super.clone只会拷贝一层。
 * small是个指针而不是一个新的对象。如果需要拷贝small，必须重写big的clone方法。详见本例。
 */
public class CopyT {
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Lei");

        Family family = new Family();
        family.setName("Yan");
        family.setChild(child);
        Family cloneFamily = null;
        try {
            cloneFamily = (Family) family.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (cloneFamily != null) {
            System.out.println("Master family hashCode " + family.hashCode()
                    + "Master child hashCode" + family.getChild().hashCode());
            System.out.println("Clone family hashCode " + cloneFamily.hashCode()
                    + "clone child hashCode" + cloneFamily.getChild().hashCode());
        }


    }
}
