// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableNatGatewayEcsMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableNatGatewayEcsMetricResponse self = new DisableNatGatewayEcsMetricResponse();
        return TeaModel.build(map, self);
    }

}
