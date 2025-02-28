// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Event extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000680003</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("eventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>STATE_TRANSITION_IS_COMPLETED</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000005043</p>
     */
    @NameInMap("jobId")
    public String jobId;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static Event build(java.util.Map<String, ?> map) throws Exception {
        Event self = new Event();
        return TeaModel.build(map, self);
    }

    public Event setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Event setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public Event setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public Event setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public Event setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public Event setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Event setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Event setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
