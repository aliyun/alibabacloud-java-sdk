// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AllotDatasetAccelerationTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static AllotDatasetAccelerationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllotDatasetAccelerationTaskResponseBody self = new AllotDatasetAccelerationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AllotDatasetAccelerationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllotDatasetAccelerationTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public AllotDatasetAccelerationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
