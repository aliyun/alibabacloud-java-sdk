// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136.models;

import com.aliyun.tea.*;

public class TestAssetResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static TestAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestAssetResponseBody self = new TestAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public TestAssetResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
