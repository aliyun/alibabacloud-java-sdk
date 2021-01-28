// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    public static ModifyNodeSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecResponseBody self = new ModifyNodeSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyNodeSpecResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
