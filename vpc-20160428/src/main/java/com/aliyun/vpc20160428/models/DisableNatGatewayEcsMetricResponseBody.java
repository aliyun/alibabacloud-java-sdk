// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableNatGatewayEcsMetricResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableNatGatewayEcsMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableNatGatewayEcsMetricResponseBody self = new DisableNatGatewayEcsMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableNatGatewayEcsMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
