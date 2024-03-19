// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QueueInfo extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("GmtDequeuedTime")
    public String gmtDequeuedTime;

    @NameInMap("GmtEnqueuedTime")
    public String gmtEnqueuedTime;

    @NameInMap("GmtPositionModifiedTime")
    public String gmtPositionModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Position")
    public Long position;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("QueueStrategy")
    public String queueStrategy;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Resource")
    public ResourceAmount resource;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubStatus")
    public String subStatus;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkloadId")
    public String workloadId;

    @NameInMap("WorkloadType")
    public String workloadType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

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

    public QueueInfo setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public QueueInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueueInfo setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
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

}
