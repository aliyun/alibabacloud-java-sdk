// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkloadInfo extends TeaModel {
    /**
     * <p>Specifies whether the task is scheduled.</p>
     */
    @NameInMap("IsScheduled")
    public String isScheduled;

    /**
     * <p>The task priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The information about the queue where the task resides.</p>
     */
    @NameInMap("QueueMetas")
    public java.util.List<QueueMeta> queueMetas;

    /**
     * <p>The ID of the Alibaba Cloud account that created the task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the RAM user that created the task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username of the task creator.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("WorkloadCreatedTime")
    public String workloadCreatedTime;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlcxxxx</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("WorkloadStatus")
    public String workloadStatus;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    /**
     * <p>The ID of the workspace where the task resides.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The name of the workspace where the task resides.</p>
     * 
     * <strong>example:</strong>
     * <p>myshellprod</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static WorkloadInfo build(java.util.Map<String, ?> map) throws Exception {
        WorkloadInfo self = new WorkloadInfo();
        return TeaModel.build(map, self);
    }

    public WorkloadInfo setIsScheduled(String isScheduled) {
        this.isScheduled = isScheduled;
        return this;
    }
    public String getIsScheduled() {
        return this.isScheduled;
    }

    public WorkloadInfo setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public WorkloadInfo setQueueMetas(java.util.List<QueueMeta> queueMetas) {
        this.queueMetas = queueMetas;
        return this;
    }
    public java.util.List<QueueMeta> getQueueMetas() {
        return this.queueMetas;
    }

    public WorkloadInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public WorkloadInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WorkloadInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public WorkloadInfo setWorkloadCreatedTime(String workloadCreatedTime) {
        this.workloadCreatedTime = workloadCreatedTime;
        return this;
    }
    public String getWorkloadCreatedTime() {
        return this.workloadCreatedTime;
    }

    public WorkloadInfo setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public WorkloadInfo setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

    public WorkloadInfo setWorkloadStatus(String workloadStatus) {
        this.workloadStatus = workloadStatus;
        return this;
    }
    public String getWorkloadStatus() {
        return this.workloadStatus;
    }

    public WorkloadInfo setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

    public WorkloadInfo setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkloadInfo setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
