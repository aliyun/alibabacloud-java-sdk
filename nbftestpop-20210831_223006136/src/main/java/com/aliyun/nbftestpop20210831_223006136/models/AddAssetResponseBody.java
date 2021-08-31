// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136.models;

import com.aliyun.tea.*;

public class AddAssetResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static AddAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAssetResponseBody self = new AddAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAssetResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
