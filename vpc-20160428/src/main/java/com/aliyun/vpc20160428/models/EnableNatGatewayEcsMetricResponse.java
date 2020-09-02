// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnableNatGatewayEcsMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableNatGatewayEcsMetricResponse self = new EnableNatGatewayEcsMetricResponse();
        return TeaModel.build(map, self);
    }

    public EnableNatGatewayEcsMetricResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
