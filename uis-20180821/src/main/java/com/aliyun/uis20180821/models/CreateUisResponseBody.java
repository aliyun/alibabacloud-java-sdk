// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UisId")
    public String uisId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateUisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUisResponseBody self = new CreateUisResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUisResponseBody setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public CreateUisResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
