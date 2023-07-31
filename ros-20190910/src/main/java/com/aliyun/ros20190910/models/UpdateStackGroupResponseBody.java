// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateStackGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupResponseBody self = new UpdateStackGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public UpdateStackGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
