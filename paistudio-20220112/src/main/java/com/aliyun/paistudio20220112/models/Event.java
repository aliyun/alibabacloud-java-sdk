// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Event extends TeaModel {
    /**
     * <p>The event content.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eventxxx</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateQuota</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>Empty</p>
     */
    @NameInMap("Function")
    public String function;

    /**
     * <p>Indicates whether the content is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>Object ID</p>
     * 
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The object type.</p>
     * 
     * <strong>example:</strong>
     * <p>Quota</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TriggerTenantId")
    public String triggerTenantId;

    /**
     * <p>The trigger time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("TriggerTime")
    public String triggerTime;

    /**
     * <p>The RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("TriggerUserId")
    public String triggerUserId;

    /**
     * <p>The trigger source.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("TriggeredBy")
    public String triggeredBy;

    public static Event build(java.util.Map<String, ?> map) throws Exception {
        Event self = new Event();
        return TeaModel.build(map, self);
    }

    public Event setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Event setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public Event setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public Event setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public Event setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public Event setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public Event setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public Event setTriggerTenantId(String triggerTenantId) {
        this.triggerTenantId = triggerTenantId;
        return this;
    }
    public String getTriggerTenantId() {
        return this.triggerTenantId;
    }

    public Event setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }
    public String getTriggerTime() {
        return this.triggerTime;
    }

    public Event setTriggerUserId(String triggerUserId) {
        this.triggerUserId = triggerUserId;
        return this;
    }
    public String getTriggerUserId() {
        return this.triggerUserId;
    }

    public Event setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
        return this;
    }
    public String getTriggeredBy() {
        return this.triggeredBy;
    }

}
