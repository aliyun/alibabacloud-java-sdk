// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderRequest extends TeaModel {
    /**
     * <p>76fa5c0-9ebb-4bb4-b383-1f885447\\*\\*\\*\\*</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
