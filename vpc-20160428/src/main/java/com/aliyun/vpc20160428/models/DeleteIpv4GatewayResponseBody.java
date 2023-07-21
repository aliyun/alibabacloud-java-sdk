// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv4GatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpv4GatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv4GatewayResponseBody self = new DeleteIpv4GatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpv4GatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
