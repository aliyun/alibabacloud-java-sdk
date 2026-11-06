// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group to which the task belongs, such as cg_101. If you specify this parameter, a group space task is created, and the caller must be a valid group member. If you leave this parameter empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1112</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The business status code. A value of 200 indicates success. A failure is indicated by a backend error code, such as ERR.* or InvalidParameter.*.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("initiatorUserId")
    public String initiatorUserId;

    /**
     * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The initiator filter based on the platform user ID. The scope is the executor of the record. For manual execution, it is the user who triggers the task. For automatic execution, it is the task creator. To view only the tasks that you initiated, specify the current user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The execution status filter in lowercase. Valid values: pending (queued), running (running), success (successful), failed (failed), timeout (timed out), and cancelled (cancelled). If you do not specify this parameter, no filtering is applied. If you specify this parameter, no future plan items are generated.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The ID of the active tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetScheduledTaskExecutionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionRecordsRequest self = new GetScheduledTaskExecutionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionRecordsRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetScheduledTaskExecutionRecordsRequest setInitiatorUserId(String initiatorUserId) {
        this.initiatorUserId = initiatorUserId;
        return this;
    }
    public String getInitiatorUserId() {
        return this.initiatorUserId;
    }

    public GetScheduledTaskExecutionRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetScheduledTaskExecutionRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetScheduledTaskExecutionRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetScheduledTaskExecutionRecordsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetScheduledTaskExecutionRecordsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
