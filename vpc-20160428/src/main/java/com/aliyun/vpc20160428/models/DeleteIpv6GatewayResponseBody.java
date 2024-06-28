// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6GatewayResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9A8AABE-A84B-4AF2-A68A-8E2EA190E7AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpv6GatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6GatewayResponseBody self = new DeleteIpv6GatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6GatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
