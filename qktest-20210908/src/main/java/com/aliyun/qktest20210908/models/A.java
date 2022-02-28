// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class A extends TeaModel {
    // a
    @NameInMap("A")
    public String a;

    public static A build(java.util.Map<String, ?> map) throws Exception {
        A self = new A();
        return TeaModel.build(map, self);
    }

    public A setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

}
