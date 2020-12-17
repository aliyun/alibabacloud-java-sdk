// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperationId")
    @Validation(required = true)
    public String operationId;

    public static DeleteStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesResponse self = new DeleteStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStackInstancesResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
