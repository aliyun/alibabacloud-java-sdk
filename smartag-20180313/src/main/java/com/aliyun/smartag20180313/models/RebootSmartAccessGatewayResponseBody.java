// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RebootSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B1792769-5CC3-4D6F-A5A5-E6408EBFBAD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootSmartAccessGatewayResponseBody self = new RebootSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
