// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnGatewayResponseBody self = new DeleteVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
