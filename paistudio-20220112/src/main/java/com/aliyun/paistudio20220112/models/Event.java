// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Event extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Function")
    public String function;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("TriggerTenantId")
    public String triggerTenantId;

    @NameInMap("TriggerTime")
    public String triggerTime;

    @NameInMap("TriggerUserId")
    public String triggerUserId;

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
