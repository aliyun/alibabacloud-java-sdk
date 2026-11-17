// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunWorkflowNodeResponseBody extends TeaModel {
    /**
     * <p>The list of node keys affected by this rerun, which the caller can use to refresh data. This list is always included in a successful response and may be omitted in an error response.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;query.amount&quot;]</p>
     */
    @NameInMap("affectedNodeKeys")
    public java.util.List<String> affectedNodeKeys;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current physical plan ID after the rerun. Rerunning a fixed planning node may generate a new plan. Use this value for subsequent queries.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_new</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The current plan revision number after the rerun.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>The current workflow run ID. This value remains unchanged when a fixed node generates a new revision.</p>
     * 
     * <strong>example:</strong>
     * <p>run_20261105_01</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The workflow state version after the rerun is accepted.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    public static RerunWorkflowNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowNodeResponseBody self = new RerunWorkflowNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowNodeResponseBody setAffectedNodeKeys(java.util.List<String> affectedNodeKeys) {
        this.affectedNodeKeys = affectedNodeKeys;
        return this;
    }
    public java.util.List<String> getAffectedNodeKeys() {
        return this.affectedNodeKeys;
    }

    public RerunWorkflowNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RerunWorkflowNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RerunWorkflowNodeResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RerunWorkflowNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RerunWorkflowNodeResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public RerunWorkflowNodeResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public RerunWorkflowNodeResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

}
