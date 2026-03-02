// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SavepointFailure extends TeaModel {
    /**
     * <p>The time when the deployment fails.</p>
     * 
     * <strong>example:</strong>
     * <p>1655006835</p>
     */
    @NameInMap("failedAt")
    public Long failedAt;

    /**
     * <p>The failure information.</p>
     * 
     * <strong>example:</strong>
     * <p>create savepoint failed</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The reason for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>IO Exception</p>
     */
    @NameInMap("reason")
    public String reason;

    public static SavepointFailure build(java.util.Map<String, ?> map) throws Exception {
        SavepointFailure self = new SavepointFailure();
        return TeaModel.build(map, self);
    }

    public SavepointFailure setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
        return this;
    }
    public Long getFailedAt() {
        return this.failedAt;
    }

    public SavepointFailure setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SavepointFailure setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
