// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QueueInfo extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>roleMaximumResource</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error type.</p>
     * 
     * <strong>example:</strong>
     * <p>ConfigRule</p>
     */
    @NameInMap("CodeType")
    public String codeType;

    /**
     * <p>The task creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>The dequeue time.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2023-06-22T00:00:00Z&quot;</p>
     */
    @NameInMap("GmtDequeuedTime")
    public String gmtDequeuedTime;

    /**
     * <p>The enqueue time.</p>
     * 
     * <strong>example:</strong>
     * <p>“2023-06-22T00:00:00Z”</p>
     */
    @NameInMap("GmtEnqueuedTime")
    public String gmtEnqueuedTime;

    /**
     * <p>The queue position change time.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2023-06-22T00:00:00Z&quot;</p>
     */
    @NameInMap("GmtPositionModifiedTime")
    public String gmtPositionModifiedTime;

    /**
     * <p>The name of the underlying QueueUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>test-label-79f5498dd-9qrzs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The queue position.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Position")
    public Long position;

    /**
     * <p>The task priority.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The dequeue strategy of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <p>The quota used by the task.</p>
     * 
     * <strong>example:</strong>
     * <p>“quotamtl37ge7gkvdz”</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Current GPU Limit is 5, limited by Role PAI.AlgoDeveloper</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The resource usage.</p>
     */
    @NameInMap("Resource")
    public ResourceAmount resource;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Enqueued</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether the task uses idle resources. Valid values:</p>
     * <ul>
     * <li>true: Used.</li>
     * <li>false: Not used.</li>
     * </ul>
     */
    @NameInMap("UseOversoldResource")
    public Boolean useOversoldResource;

    /**
     * <p>The creator information.</p>
     * 
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserName")
    public String userName;

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
     * <p>The specific status of DLC, DSW, or EAS.</p>
     * 
     * <strong>example:</strong>
     * <p>PreAllocation</p>
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
     * <p>The workspace of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>“432524”</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The name of the workspace where the task resides.</p>
     * 
     * <strong>example:</strong>
     * <p>pai_dlc</p>
     */
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
