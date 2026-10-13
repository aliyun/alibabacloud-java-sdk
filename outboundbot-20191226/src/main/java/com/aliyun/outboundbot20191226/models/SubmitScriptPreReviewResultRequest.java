// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitScriptPreReviewResultRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the script review record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b8e1a4d3-9c2f-4e6a-b7d5-3f1e2a4c6b8d</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The reason for pre-review rejection. This parameter is required when ReviewResult is set to REJECT.</p>
     * 
     * <strong>example:</strong>
     * <p>The script content involves sensitive information</p>
     */
    @NameInMap("RejectReason")
    public String rejectReason;

    /**
     * <p>The pre-review result. Valid values: PASS (approved) and REJECT (rejected). The value is not case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("ReviewResult")
    public String reviewResult;

    public static SubmitScriptPreReviewResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitScriptPreReviewResultRequest self = new SubmitScriptPreReviewResultRequest();
        return TeaModel.build(map, self);
    }

    public SubmitScriptPreReviewResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitScriptPreReviewResultRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public SubmitScriptPreReviewResultRequest setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
    public String getRejectReason() {
        return this.rejectReason;
    }

    public SubmitScriptPreReviewResultRequest setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }
    public String getReviewResult() {
        return this.reviewResult;
    }

}
