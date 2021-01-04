// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnlockSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnlockSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockSmartAccessGatewayResponseBody self = new UnlockSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
