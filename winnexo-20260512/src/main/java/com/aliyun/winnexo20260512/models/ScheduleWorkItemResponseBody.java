// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ScheduleWorkItemResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>本次是否新创建 Plan</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("created")
    public Boolean created;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>物理计划ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
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
     * <p>修订号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>运行ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>运行序号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runSeq")
    public Long runSeq;

    /**
     * <p>工作项ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static ScheduleWorkItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScheduleWorkItemResponseBody self = new ScheduleWorkItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ScheduleWorkItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ScheduleWorkItemResponseBody setCreated(Boolean created) {
        this.created = created;
        return this;
    }
    public Boolean getCreated() {
        return this.created;
    }

    public ScheduleWorkItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScheduleWorkItemResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ScheduleWorkItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScheduleWorkItemResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public ScheduleWorkItemResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public ScheduleWorkItemResponseBody setRunSeq(Long runSeq) {
        this.runSeq = runSeq;
        return this;
    }
    public Long getRunSeq() {
        return this.runSeq;
    }

    public ScheduleWorkItemResponseBody setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
