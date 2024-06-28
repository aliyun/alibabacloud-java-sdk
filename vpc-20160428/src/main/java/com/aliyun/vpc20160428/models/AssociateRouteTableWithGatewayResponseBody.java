// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableWithGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F89C2176-8F10-55EF-90CF-CF99D1E3F816</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateRouteTableWithGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableWithGatewayResponseBody self = new AssociateRouteTableWithGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTableWithGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
