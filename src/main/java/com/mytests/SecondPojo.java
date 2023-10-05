package com.mytests;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

/**
secondPojo - just pojo with 2 fields
 */
@Introspected
@Serdeable.Deserializable
public class SecondPojo {
    int p1;
    boolean p2;

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public boolean isP2() {
        return p2;
    }

    public void setP2(boolean p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "SecondPojo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
