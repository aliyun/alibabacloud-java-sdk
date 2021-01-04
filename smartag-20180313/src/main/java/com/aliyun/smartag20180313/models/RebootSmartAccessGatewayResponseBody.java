// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RebootSmartAccessGatewayResponseBody extends TeaModel {
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
