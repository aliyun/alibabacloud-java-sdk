// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderRequest extends TeaModel {
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static DescribeChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeOrderRequest self = new DescribeChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChangeOrderRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
