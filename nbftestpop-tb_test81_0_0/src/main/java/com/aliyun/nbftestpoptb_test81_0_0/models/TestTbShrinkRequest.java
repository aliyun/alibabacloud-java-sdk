// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test81_0_0.models;

import com.aliyun.tea.*;

public class TestTbShrinkRequest extends TeaModel {
    @NameInMap("query")
    public String queryShrink;

    public static TestTbShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TestTbShrinkRequest self = new TestTbShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TestTbShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

}
