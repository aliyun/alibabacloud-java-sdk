// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QueueMeta extends TeaModel {
    @NameInMap("GmtDequeuedTime")
    public String gmtDequeuedTime;

    @NameInMap("GmtEnqueuedTime")
    public String gmtEnqueuedTime;

    @NameInMap("GmtPositionModifiedTime")
    public String gmtPositionModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Position")
    public String position;

    @NameInMap("QueueStrategy")
    public String queueStrategy;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("Resource")
    public ResourceAmount resource;

    @NameInMap("ScheduledResource")
    public String scheduledResource;

    @NameInMap("Status")
    public String status;

    @NameInMap("UseOversoldResource")
    public Boolean useOversoldResource;

    public static QueueMeta build(java.util.Map<String, ?> map) throws Exception {
        QueueMeta self = new QueueMeta();
        return TeaModel.build(map, self);
    }

    public QueueMeta setGmtDequeuedTime(String gmtDequeuedTime) {
        this.gmtDequeuedTime = gmtDequeuedTime;
        return this;
    }
    public String getGmtDequeuedTime() {
        return this.gmtDequeuedTime;
    }

    public QueueMeta setGmtEnqueuedTime(String gmtEnqueuedTime) {
        this.gmtEnqueuedTime = gmtEnqueuedTime;
        return this;
    }
    public String getGmtEnqueuedTime() {
        return this.gmtEnqueuedTime;
    }

    public QueueMeta setGmtPositionModifiedTime(String gmtPositionModifiedTime) {
        this.gmtPositionModifiedTime = gmtPositionModifiedTime;
        return this;
    }
    public String getGmtPositionModifiedTime() {
        return this.gmtPositionModifiedTime;
    }

    public QueueMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueueMeta setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public QueueMeta setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public QueueMeta setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public QueueMeta setResource(ResourceAmount resource) {
        this.resource = resource;
        return this;
    }
    public ResourceAmount getResource() {
        return this.resource;
    }

    public QueueMeta setScheduledResource(String scheduledResource) {
        this.scheduledResource = scheduledResource;
        return this;
    }
    public String getScheduledResource() {
        return this.scheduledResource;
    }

    public QueueMeta setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueueMeta setUseOversoldResource(Boolean useOversoldResource) {
        this.useOversoldResource = useOversoldResource;
        return this;
    }
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

}
