// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateRouteTablesFromVpcGatewayEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30F711D5-E7E2-5D42-A247-0FA7288BEAAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateRouteTablesFromVpcGatewayEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateRouteTablesFromVpcGatewayEndpointResponseBody self = new DissociateRouteTablesFromVpcGatewayEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateRouteTablesFromVpcGatewayEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
