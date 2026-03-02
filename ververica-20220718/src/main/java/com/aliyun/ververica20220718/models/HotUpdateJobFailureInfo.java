// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class HotUpdateJobFailureInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("failureSeverity")
    public String failureSeverity;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("reason")
    public String reason;

    public static HotUpdateJobFailureInfo build(java.util.Map<String, ?> map) throws Exception {
        HotUpdateJobFailureInfo self = new HotUpdateJobFailureInfo();
        return TeaModel.build(map, self);
    }

    public HotUpdateJobFailureInfo setFailureSeverity(String failureSeverity) {
        this.failureSeverity = failureSeverity;
        return this;
    }
    public String getFailureSeverity() {
        return this.failureSeverity;
    }

    public HotUpdateJobFailureInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotUpdateJobFailureInfo setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
