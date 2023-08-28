// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Condition extends TeaModel {
    @NameInMap("int_equals")
    public java.util.List<Long> intEquals;

    @NameInMap("int_not_equals")
    public java.util.List<Long> intNotEquals;

    @NameInMap("string_equals")
    public java.util.List<String> stringEquals;

    @NameInMap("string_not_equals")
    public java.util.List<String> stringNotEquals;

    public static Condition build(java.util.Map<String, ?> map) throws Exception {
        Condition self = new Condition();
        return TeaModel.build(map, self);
    }

    public Condition setIntEquals(java.util.List<Long> intEquals) {
        this.intEquals = intEquals;
        return this;
    }
    public java.util.List<Long> getIntEquals() {
        return this.intEquals;
    }

    public Condition setIntNotEquals(java.util.List<Long> intNotEquals) {
        this.intNotEquals = intNotEquals;
        return this;
    }
    public java.util.List<Long> getIntNotEquals() {
        return this.intNotEquals;
    }

    public Condition setStringEquals(java.util.List<String> stringEquals) {
        this.stringEquals = stringEquals;
        return this;
    }
    public java.util.List<String> getStringEquals() {
        return this.stringEquals;
    }

    public Condition setStringNotEquals(java.util.List<String> stringNotEquals) {
        this.stringNotEquals = stringNotEquals;
        return this;
    }
    public java.util.List<String> getStringNotEquals() {
        return this.stringNotEquals;
    }

}
