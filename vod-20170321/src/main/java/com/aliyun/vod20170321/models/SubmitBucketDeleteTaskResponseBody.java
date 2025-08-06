// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitBucketDeleteTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitBucketDeleteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBucketDeleteTaskResponseBody self = new SubmitBucketDeleteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBucketDeleteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitBucketDeleteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
