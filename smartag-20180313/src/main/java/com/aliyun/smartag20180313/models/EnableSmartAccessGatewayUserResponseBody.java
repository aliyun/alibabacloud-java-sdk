// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class EnableSmartAccessGatewayUserResponseBody extends TeaModel {
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
