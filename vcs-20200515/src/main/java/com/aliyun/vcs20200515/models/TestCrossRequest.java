// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class TestCrossRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static TestCrossRequest build(java.util.Map<String, ?> map) throws Exception {
        TestCrossRequest self = new TestCrossRequest();
        return TeaModel.build(map, self);
    }

    public TestCrossRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
