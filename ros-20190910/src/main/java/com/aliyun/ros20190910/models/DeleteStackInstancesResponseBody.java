// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>6da106ca-1784-4a6f-a7e1-e723863d****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
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
