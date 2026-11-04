// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class SandboxLifecycleEvent extends TeaModel {
    /**
     * <p>The action that triggered the event.</p>
     * 
     * <strong>example:</strong>
     * <p>delete</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The template build ID. This field is not returned if there is no associated build.</p>
     * 
     * <strong>example:</strong>
     * <p>bld-example-001</p>
     */
    @NameInMap("buildID")
    public String buildID;

    /**
     * <p>The event description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sandbox deleted</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The event data as a JSON object. The specific fields vary depending on the event type.</p>
     */
    @NameInMap("eventData")
    public java.util.Map<String, ?> eventData;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>df3c6750-2c5e-50d1-8b81-7a2248f6ca3b</p>
     */
    @NameInMap("eventID")
    public String eventID;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>terminated</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The event category. Valid values: INFO and WARNING.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("level")
    public String level;

    /**
     * <p>The time when the event occurred. The time is in UTC RFC3339 format and supports fractional seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08T06:18:38.123Z</p>
     */
    @NameInMap("occurredAt")
    public String occurredAt;

    /**
     * <p>The reason for the event. This field is not returned if there is no reason.</p>
     * 
     * <strong>example:</strong>
     * <p>request</p>
     */
    @NameInMap("reason")
    public String reason;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sbx-62105527-699e-48df-ad3b-7425001ae4f2</p>
     */
    @NameInMap("sandboxID")
    public String sandboxID;

    /**
     * <p>The ID of the team to which the event belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0333-58d8-97ac-5336eb9179eb</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4hrtmghh2nzrsdh6yr65</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static SandboxLifecycleEvent build(java.util.Map<String, ?> map) throws Exception {
        SandboxLifecycleEvent self = new SandboxLifecycleEvent();
        return TeaModel.build(map, self);
    }

    public SandboxLifecycleEvent setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SandboxLifecycleEvent setBuildID(String buildID) {
        this.buildID = buildID;
        return this;
    }
    public String getBuildID() {
        return this.buildID;
    }

    public SandboxLifecycleEvent setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SandboxLifecycleEvent setEventData(java.util.Map<String, ?> eventData) {
        this.eventData = eventData;
        return this;
    }
    public java.util.Map<String, ?> getEventData() {
        return this.eventData;
    }

    public SandboxLifecycleEvent setEventID(String eventID) {
        this.eventID = eventID;
        return this;
    }
    public String getEventID() {
        return this.eventID;
    }

    public SandboxLifecycleEvent setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SandboxLifecycleEvent setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SandboxLifecycleEvent setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }
    public String getOccurredAt() {
        return this.occurredAt;
    }

    public SandboxLifecycleEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SandboxLifecycleEvent setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public SandboxLifecycleEvent setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public SandboxLifecycleEvent setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
