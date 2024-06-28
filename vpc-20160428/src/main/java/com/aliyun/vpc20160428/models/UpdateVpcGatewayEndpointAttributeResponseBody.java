// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E9654534-5A38-5545-813F-0403D49042FB</p>
     */
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
