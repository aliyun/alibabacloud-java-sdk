// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasEmergencyOrderRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    public static ExecHasEmergencyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasEmergencyOrderRequest self = new ExecHasEmergencyOrderRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasEmergencyOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
