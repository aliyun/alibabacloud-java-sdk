// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DraftDeployResult extends TeaModel {
    @NameInMap("artifactValidationDetail")
    public ValidateStatementResult artifactValidationDetail;

    /**
     * <strong>example:</strong>
     * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DraftDeployResult build(java.util.Map<String, ?> map) throws Exception {
        DraftDeployResult self = new DraftDeployResult();
        return TeaModel.build(map, self);
    }

    public DraftDeployResult setArtifactValidationDetail(ValidateStatementResult artifactValidationDetail) {
        this.artifactValidationDetail = artifactValidationDetail;
        return this;
    }
    public ValidateStatementResult getArtifactValidationDetail() {
        return this.artifactValidationDetail;
    }

    public DraftDeployResult setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public DraftDeployResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DraftDeployResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
