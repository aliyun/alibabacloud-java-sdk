// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteGatewayRouteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRouteResponseBody self = new DeleteGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
