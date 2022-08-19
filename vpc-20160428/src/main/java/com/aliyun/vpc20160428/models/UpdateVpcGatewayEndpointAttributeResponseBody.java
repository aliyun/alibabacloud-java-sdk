// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVpcGatewayEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcGatewayEndpointAttributeResponseBody self = new UpdateVpcGatewayEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVpcGatewayEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
