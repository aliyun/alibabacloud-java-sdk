// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindSmartAccessGatewayResponseBody extends TeaModel {
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
