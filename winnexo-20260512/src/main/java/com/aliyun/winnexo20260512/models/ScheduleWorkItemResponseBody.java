// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ScheduleWorkItemResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether a new plan is created in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("created")
    public Boolean created;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the physical plan.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
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
     * <p>The revision number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>The run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The run sequence number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runSeq")
    public Long runSeq;

    /**
     * <p>The ID of the work item.</p>
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
