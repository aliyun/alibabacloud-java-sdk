// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressResponseBody extends TeaModel {
    @NameInMap("EipSegmentInstanceId")
    public String eipSegmentInstanceId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocateEipSegmentAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressResponseBody self = new AllocateEipSegmentAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateEipSegmentAddressResponseBody setEipSegmentInstanceId(String eipSegmentInstanceId) {
        this.eipSegmentInstanceId = eipSegmentInstanceId;
        return this;
    }
    public String getEipSegmentInstanceId() {
        return this.eipSegmentInstanceId;
    }

    public AllocateEipSegmentAddressResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public AllocateEipSegmentAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
