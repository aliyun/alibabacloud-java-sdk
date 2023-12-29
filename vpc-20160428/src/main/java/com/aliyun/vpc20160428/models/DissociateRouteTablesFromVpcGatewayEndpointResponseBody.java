// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateRouteTablesFromVpcGatewayEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
