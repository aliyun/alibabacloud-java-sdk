// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperationId")
    @Validation(required = true)
    public String operationId;

    public static CreateStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesResponse self = new CreateStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackInstancesResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
