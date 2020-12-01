// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderQuery extends TeaModel {
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    public String changeOrderId;

    public static DescribeChangeOrderQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeOrderQuery self = new DescribeChangeOrderQuery();
        return TeaModel.build(map, self);
    }

    public DescribeChangeOrderQuery setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
