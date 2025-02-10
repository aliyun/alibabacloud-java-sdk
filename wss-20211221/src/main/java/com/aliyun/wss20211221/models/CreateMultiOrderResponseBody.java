// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderResponseBody extends TeaModel {
    @NameInMap("OrderIds")
    public java.util.List<Long> orderIds;

    /**
     * <strong>example:</strong>
     * <p>833C4D2C-09C7-5CE6-8159-06758B964970</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMultiOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderResponseBody self = new CreateMultiOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderResponseBody setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    public CreateMultiOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
