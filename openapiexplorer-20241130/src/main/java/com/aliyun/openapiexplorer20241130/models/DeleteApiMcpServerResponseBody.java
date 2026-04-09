// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class DeleteApiMcpServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteApiMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiMcpServerResponseBody self = new DeleteApiMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
