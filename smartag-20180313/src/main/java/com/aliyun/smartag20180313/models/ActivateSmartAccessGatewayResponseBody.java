// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ActivateSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E223E535-AE11-4158-B00F-DC107887A909</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActivateSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateSmartAccessGatewayResponseBody self = new ActivateSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
