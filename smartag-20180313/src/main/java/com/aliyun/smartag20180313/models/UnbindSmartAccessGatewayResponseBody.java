// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSmartAccessGatewayResponseBody self = new UnbindSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
