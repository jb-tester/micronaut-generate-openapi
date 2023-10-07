package com.mytests.types;

import java.util.List;
import java.util.Map;

/**
  firstPojo - pojo with multiple props of diff types
 */
public class FirstPojo {
    String prop1;
    String[] prop2;
    List<Integer> prop3;
    MyEnum prop4;
    Map<MyEnum,SecondPojo> prop5;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String[] getProp2() {
        return prop2;
    }

    public void setProp2(String[] prop2) {
        this.prop2 = prop2;
    }

    public List<Integer> getProp3() {
        return prop3;
    }

    public void setProp3(List<Integer> prop3) {
        this.prop3 = prop3;
    }

    public MyEnum getProp4() {
        return prop4;
    }

    public void setProp4(MyEnum prop4) {
        this.prop4 = prop4;
    }

    public Map<MyEnum, SecondPojo> getProp5() {
        return prop5;
    }

    public void setProp5(Map<MyEnum, SecondPojo> prop5) {
        this.prop5 = prop5;
    }
}
