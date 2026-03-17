// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ResetSmartAccessGatewayClientUserPasswordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BE1F7E80-4558-4021-B6D2-B94DA8AAAF81</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetSmartAccessGatewayClientUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetSmartAccessGatewayClientUserPasswordResponseBody self = new ResetSmartAccessGatewayClientUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetSmartAccessGatewayClientUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
