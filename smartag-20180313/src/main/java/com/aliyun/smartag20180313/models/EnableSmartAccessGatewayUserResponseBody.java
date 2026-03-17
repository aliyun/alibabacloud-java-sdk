// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class EnableSmartAccessGatewayUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F5894299-84A2-48C1-A999-28908B99F45D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableSmartAccessGatewayUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSmartAccessGatewayUserResponseBody self = new EnableSmartAccessGatewayUserResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSmartAccessGatewayUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
