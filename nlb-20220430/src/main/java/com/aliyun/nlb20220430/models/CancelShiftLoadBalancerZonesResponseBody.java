// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CancelShiftLoadBalancerZonesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelShiftLoadBalancerZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelShiftLoadBalancerZonesResponseBody self = new CancelShiftLoadBalancerZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelShiftLoadBalancerZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
