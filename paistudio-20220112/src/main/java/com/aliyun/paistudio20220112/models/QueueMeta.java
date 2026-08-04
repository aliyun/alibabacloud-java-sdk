// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QueueMeta extends TeaModel {
    /**
     * <p>The time the entry was removed from the queue.</p>
     */
    @NameInMap("GmtDequeuedTime")
    public String gmtDequeuedTime;

    /**
     * <p>The time the entry was added to the queue.</p>
     */
    @NameInMap("GmtEnqueuedTime")
    public String gmtEnqueuedTime;

    /**
     * <p>The last time the position of the entry was modified.</p>
     */
    @NameInMap("GmtPositionModifiedTime")
    public String gmtPositionModifiedTime;

    /**
     * <p>The name of the queue entry.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The position of the entry in the queue.</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>The queuing strategy for the entry.</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <p>The ID of the associated quota.</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The resources that the queue entry requires.</p>
     */
    @NameInMap("Resource")
    public ResourceAmount resource;

    /**
     * <p>The resources scheduled for the entry.</p>
     */
    @NameInMap("ScheduledResource")
    public String scheduledResource;

    /**
     * <p>The current status of the entry.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the entry can use oversold resources.</p>
     */
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
