// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskConversationRecordsRequest extends TeaModel {
    /**
     * <p>The user ID of the task initiator.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("initiatorUserId")
    public String initiatorUserId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The maximum number of data records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The running status of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The execution status filter in lowercase. Valid values: pending (queued), running (running), success (successful), failed (failed), timeout (timed out), and cancelled (cancelled). If you do not specify this parameter, no filtering is applied. If you specify this parameter, future scheduled items are not generated.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The tenant ID. This is a common parameter. If you do not specify this parameter, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetScheduledTaskConversationRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskConversationRecordsRequest self = new GetScheduledTaskConversationRecordsRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskConversationRecordsRequest setInitiatorUserId(String initiatorUserId) {
        this.initiatorUserId = initiatorUserId;
        return this;
    }
    public String getInitiatorUserId() {
        return this.initiatorUserId;
    }

    public GetScheduledTaskConversationRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetScheduledTaskConversationRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetScheduledTaskConversationRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetScheduledTaskConversationRecordsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetScheduledTaskConversationRecordsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
