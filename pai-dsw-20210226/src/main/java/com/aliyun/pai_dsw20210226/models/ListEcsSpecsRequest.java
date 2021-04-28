// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListEcsSpecsRequest extends TeaModel {
    // 每页返回的实例数
    @NameInMap("AcceleratorTypeEquals")
    public String acceleratorTypeEquals;

    public static ListEcsSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsRequest self = new ListEcsSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsRequest setAcceleratorTypeEquals(String acceleratorTypeEquals) {
        this.acceleratorTypeEquals = acceleratorTypeEquals;
        return this;
    }
    public String getAcceleratorTypeEquals() {
        return this.acceleratorTypeEquals;
    }

}
