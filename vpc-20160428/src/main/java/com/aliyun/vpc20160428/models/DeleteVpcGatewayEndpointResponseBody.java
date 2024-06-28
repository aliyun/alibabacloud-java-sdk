// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpcGatewayEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1122D0F-7B3B-5445-BB19-17F27F97FE1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcGatewayEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcGatewayEndpointResponseBody self = new DeleteVpcGatewayEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcGatewayEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
