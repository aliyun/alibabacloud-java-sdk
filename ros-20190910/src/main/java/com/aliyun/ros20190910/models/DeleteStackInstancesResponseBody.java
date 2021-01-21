// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperationId")
    public String operationId;

    public static DeleteStackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesResponseBody self = new DeleteStackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStackInstancesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
