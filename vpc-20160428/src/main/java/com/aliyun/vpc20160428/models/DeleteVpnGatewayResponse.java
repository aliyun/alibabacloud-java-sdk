// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnGatewayResponse self = new DeleteVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnGatewayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
