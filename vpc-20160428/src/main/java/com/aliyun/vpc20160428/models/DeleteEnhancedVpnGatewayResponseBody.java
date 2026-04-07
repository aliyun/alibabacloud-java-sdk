// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteEnhancedVpnGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E9A8AABE-A84B-4AF2-A68A-8E2EA190E7AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnhancedVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnhancedVpnGatewayResponseBody self = new DeleteEnhancedVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnhancedVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
