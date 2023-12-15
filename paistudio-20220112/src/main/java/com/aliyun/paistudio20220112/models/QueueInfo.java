// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QueueInfo extends TeaModel {
    @NameInMap("GmtEnqueuedTime")
    public String gmtEnqueuedTime;

    @NameInMap("GmtPositionModifiedTime")
    public String gmtPositionModifiedTime;

    @NameInMap("Position")
    public Long position;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("QueueStrategy")
    public String queueStrategy;

    @NameInMap("QuotaId")
    public String quotaId;

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
