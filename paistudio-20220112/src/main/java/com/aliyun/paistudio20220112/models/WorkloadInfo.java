// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkloadInfo extends TeaModel {
    /**
     * <p>Specifies whether the workload is scheduled. Valid values are <code>true</code> and <code>false</code>.</p>
     */
    @NameInMap("IsScheduled")
    public String isScheduled;

    /**
     * <p>The scheduling priority of the workload. A higher value indicates a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>A list of metadata for the queues associated with the workload.</p>
     */
    @NameInMap("QueueMetas")
    public java.util.List<QueueMeta> queueMetas;

    /**
     * <p>The ID of the tenant that contains the workload.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the user who created the workload.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The name of the user who created the workload.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The creation time of the workload, in UTC format.</p>
     */
    @NameInMap("WorkloadCreatedTime")
    public String workloadCreatedTime;

    /**
     * <p>The unique, system-generated ID for the workload.</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    /**
     * <p>The user-defined name of the workload.</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    /**
     * <p>The current status of the workload. Possible values include <code>Pending</code>, <code>Running</code>, <code>Succeeded</code>, and <code>Failed</code>.</p>
     */
    @NameInMap("WorkloadStatus")
    public String workloadStatus;

    /**
     * <p>The type of the workload.</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    /**
     * <p>The ID of the workspace that contains the workload.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The name of the workspace that contains the workload.</p>
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
