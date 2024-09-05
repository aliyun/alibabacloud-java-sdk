// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CloseTaskOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E211129AE190Y3</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>操作人姓名</p>
     */
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
