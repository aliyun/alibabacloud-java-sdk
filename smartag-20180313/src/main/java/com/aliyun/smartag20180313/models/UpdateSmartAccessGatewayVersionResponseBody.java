// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
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
