// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkloadInfo extends TeaModel {
    @NameInMap("IsScheduled")
    public String isScheduled;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("QueueMetas")
    public java.util.List<QueueMeta> queueMetas;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("WorkloadCreatedTime")
    public String workloadCreatedTime;

    @NameInMap("WorkloadId")
    public String workloadId;

    @NameInMap("WorkloadName")
    public String workloadName;

    @NameInMap("WorkloadStatus")
    public String workloadStatus;

    @NameInMap("WorkloadType")
    public String workloadType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

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
