// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test11_0_0.models;

import com.aliyun.tea.*;

public class TestApiRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    public static TestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        TestApiRequest self = new TestApiRequest();
        return TeaModel.build(map, self);
    }

    public TestApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
