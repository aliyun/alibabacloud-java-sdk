// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class QueryTaskInfoRequest extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E220303AE1BYY3</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    public static QueryTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoRequest self = new QueryTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
