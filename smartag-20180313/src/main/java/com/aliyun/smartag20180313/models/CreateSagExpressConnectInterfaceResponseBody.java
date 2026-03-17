// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSagExpressConnectInterfaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AFF7E5A6-6897-4FDC-A5A8-1978B5B3E545</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSagExpressConnectInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSagExpressConnectInterfaceResponseBody self = new CreateSagExpressConnectInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSagExpressConnectInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
