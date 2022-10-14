// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobFailure extends TeaModel {
    @NameInMap("failedAt")
    public Long failedAt;

    @NameInMap("message")
    public String message;

    @NameInMap("reason")
    public String reason;

    public static JobFailure build(java.util.Map<String, ?> map) throws Exception {
        JobFailure self = new JobFailure();
        return TeaModel.build(map, self);
    }

    public JobFailure setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
        return this;
    }
    public Long getFailedAt() {
        return this.failedAt;
    }

    public JobFailure setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JobFailure setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
