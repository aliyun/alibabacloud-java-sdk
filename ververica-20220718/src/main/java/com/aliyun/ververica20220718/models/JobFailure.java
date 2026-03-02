// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobFailure extends TeaModel {
    /**
     * <p>The time when the deployment fails.</p>
     * 
     * <strong>example:</strong>
     * <p>1660120062</p>
     */
    @NameInMap("failedAt")
    public Long failedAt;

    /**
     * <p>The details of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes deployment resource with name job-8b7db913-5b1f-4ac5-a332-8d50f342**** is not progressing.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The reason for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>KubernetesDeploymentNotProgressing</p>
     */
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
