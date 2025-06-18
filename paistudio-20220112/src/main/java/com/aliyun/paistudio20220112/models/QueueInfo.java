// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QueueInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>roleMaximumResource</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>ConfigRule</p>
     */
    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <strong>example:</strong>
     * <p>&quot;2023-06-22T00:00:00Z&quot;</p>
     */
    @NameInMap("GmtDequeuedTime")
    public String gmtDequeuedTime;

    /**
     * <strong>example:</strong>
     * <p>“2023-06-22T00:00:00Z”</p>
     */
    @NameInMap("GmtEnqueuedTime")
    public String gmtEnqueuedTime;

    /**
     * <strong>example:</strong>
     * <p>&quot;2023-06-22T00:00:00Z&quot;</p>
     */
    @NameInMap("GmtPositionModifiedTime")
    public String gmtPositionModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>test-label-79f5498dd-9qrzs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Position")
    public Long position;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <strong>example:</strong>
     * <p>“quotamtl37ge7gkvdz”</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <strong>example:</strong>
     * <p>Current GPU Limit is 5, limited by Role PAI.AlgoDeveloper</p>
     */
    @NameInMap("Reason")
    public String reason;

    @NameInMap("Resource")
    public ResourceAmount resource;

    /**
     * <strong>example:</strong>
     * <p>Enqueued</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("UseOversoldResource")
    public Boolean useOversoldResource;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>dlcxxxx</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    @NameInMap("WorkloadName")
    public String workloadName;

    /**
     * <strong>example:</strong>
     * <p>PreAllocation</p>
     */
    @NameInMap("WorkloadStatus")
    public String workloadStatus;

    /**
     * <strong>example:</strong>
     * <p>dlc</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    /**
     * <strong>example:</strong>
     * <p>“432524”</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static QueueInfo build(java.util.Map<String, ?> map) throws Exception {
        QueueInfo self = new QueueInfo();
        return TeaModel.build(map, self);
    }

    public QueueInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueueInfo setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public QueueInfo setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public QueueInfo setGmtDequeuedTime(String gmtDequeuedTime) {
        this.gmtDequeuedTime = gmtDequeuedTime;
        return this;
    }
    public String getGmtDequeuedTime() {
        return this.gmtDequeuedTime;
    }

    public QueueInfo setGmtEnqueuedTime(String gmtEnqueuedTime) {
        this.gmtEnqueuedTime = gmtEnqueuedTime;
        return this;
    }
    public String getGmtEnqueuedTime() {
        return this.gmtEnqueuedTime;
    }

    public QueueInfo setGmtPositionModifiedTime(String gmtPositionModifiedTime) {
        this.gmtPositionModifiedTime = gmtPositionModifiedTime;
        return this;
    }
    public String getGmtPositionModifiedTime() {
        return this.gmtPositionModifiedTime;
    }

    public QueueInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueueInfo setPosition(Long position) {
        this.position = position;
        return this;
    }
    public Long getPosition() {
        return this.position;
    }

    public QueueInfo setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public QueueInfo setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public QueueInfo setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public QueueInfo setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QueueInfo setResource(ResourceAmount resource) {
        this.resource = resource;
        return this;
    }
    public ResourceAmount getResource() {
        return this.resource;
    }

    public QueueInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueueInfo setUseOversoldResource(Boolean useOversoldResource) {
        this.useOversoldResource = useOversoldResource;
        return this;
    }
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

    public QueueInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueueInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueueInfo setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public QueueInfo setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

    public QueueInfo setWorkloadStatus(String workloadStatus) {
        this.workloadStatus = workloadStatus;
        return this;
    }
    public String getWorkloadStatus() {
        return this.workloadStatus;
    }

    public QueueInfo setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

    public QueueInfo setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public QueueInfo setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
