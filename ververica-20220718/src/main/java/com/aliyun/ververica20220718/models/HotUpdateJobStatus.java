// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class HotUpdateJobStatus extends TeaModel {
    @NameInMap("failure")
    public HotUpdateJobFailureInfo failure;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static HotUpdateJobStatus build(java.util.Map<String, ?> map) throws Exception {
        HotUpdateJobStatus self = new HotUpdateJobStatus();
        return TeaModel.build(map, self);
    }

    public HotUpdateJobStatus setFailure(HotUpdateJobFailureInfo failure) {
        this.failure = failure;
        return this;
    }
    public HotUpdateJobFailureInfo getFailure() {
        return this.failure;
    }

    public HotUpdateJobStatus setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotUpdateJobStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
