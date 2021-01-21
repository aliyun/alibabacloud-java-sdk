// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackGroupDriftResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperationId")
    public String operationId;

    public static DetectStackGroupDriftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectStackGroupDriftResponseBody self = new DetectStackGroupDriftResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectStackGroupDriftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectStackGroupDriftResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
