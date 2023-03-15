// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesResponseBody extends TeaModel {
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

    public static DeleteStackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesResponseBody self = new DeleteStackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public DeleteStackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
