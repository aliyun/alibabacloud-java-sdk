// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmartAccessGatewayVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayVersionResponseBody self = new UpdateSmartAccessGatewayVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
