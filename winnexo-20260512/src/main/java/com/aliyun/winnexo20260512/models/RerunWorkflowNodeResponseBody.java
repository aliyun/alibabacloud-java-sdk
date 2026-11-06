// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunWorkflowNodeResponseBody extends TeaModel {
    /**
     * <p>本次重跑影响的节点 key 列表，供调用方刷新；成功响应恒包含，错误响应可缺省</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;query.amount&quot;]</p>
     */
    @NameInMap("affectedNodeKeys")
    public java.util.List<String> affectedNodeKeys;

    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>重跑后的当前物理计划ID；固定规划节点重跑可能生成新计划，后续查询应使用此值</p>
     * 
     * <strong>example:</strong>
     * <p>plan_new</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>重跑后的当前计划修订号</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>当前工作流运行ID，固定节点生成新 revision 时保持不变</p>
     * 
     * <strong>example:</strong>
     * <p>run_20261105_01</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>重跑被接受后的工作流状态版本</p>
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
