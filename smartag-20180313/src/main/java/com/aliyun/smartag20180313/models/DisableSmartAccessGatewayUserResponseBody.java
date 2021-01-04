// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisableSmartAccessGatewayUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableSmartAccessGatewayUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSmartAccessGatewayUserResponseBody self = new DisableSmartAccessGatewayUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSmartAccessGatewayUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
