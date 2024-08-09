// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AsyncDraftDeployResult extends TeaModel {
    @NameInMap("artifactValidationDetail")
    public ValidateStatementResult artifactValidationDetail;

    /**
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <strong>example:</strong>
     * <p>&quot;Validation error: SQL validate failed&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("ticketStatus")
    public String ticketStatus;

    public static AsyncDraftDeployResult build(java.util.Map<String, ?> map) throws Exception {
        AsyncDraftDeployResult self = new AsyncDraftDeployResult();
        return TeaModel.build(map, self);
    }

    public AsyncDraftDeployResult setArtifactValidationDetail(ValidateStatementResult artifactValidationDetail) {
        this.artifactValidationDetail = artifactValidationDetail;
        return this;
    }
    public ValidateStatementResult getArtifactValidationDetail() {
        return this.artifactValidationDetail;
    }

    public AsyncDraftDeployResult setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public AsyncDraftDeployResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncDraftDeployResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AsyncDraftDeployResult setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

}
