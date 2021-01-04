// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ResetSmartAccessGatewayClientUserPasswordResponseBody extends TeaModel {
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
