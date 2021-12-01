// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CloseTaskOrderRequest extends TeaModel {
    // 任务单id
    @NameInMap("OrderId")
    public String orderId;

    // 操作人姓名
    @NameInMap("UserName")
    public String userName;

    public static CloseTaskOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTaskOrderRequest self = new CloseTaskOrderRequest();
        return TeaModel.build(map, self);
    }

    public CloseTaskOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CloseTaskOrderRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
