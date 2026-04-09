// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerUserConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateApiMcpServerUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiMcpServerUserConfigResponseBody self = new UpdateApiMcpServerUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApiMcpServerUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
