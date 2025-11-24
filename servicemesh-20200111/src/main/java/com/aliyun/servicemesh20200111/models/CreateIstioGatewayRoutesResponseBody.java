// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayRoutesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIstioGatewayRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayRoutesResponseBody self = new CreateIstioGatewayRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
