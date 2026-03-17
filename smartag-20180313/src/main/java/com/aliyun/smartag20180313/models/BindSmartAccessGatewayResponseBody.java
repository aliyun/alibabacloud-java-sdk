// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8A3FF8DD-B27D-4ED2-B032-5EF90B38195D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSmartAccessGatewayResponseBody self = new BindSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
