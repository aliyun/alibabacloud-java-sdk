// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AgentPlatformJob extends TeaModel {
    /**
     * <p>The ID of the AP task.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-job-example</p>
     */
    @NameInMap("AgentJobId")
    public String agentJobId;

    /**
     * <p>The attempt number of the current task.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Attempt")
    public Long attempt;

    /**
     * <p>The creation time in UTC RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-30T06:00:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The execution duration of the current attempt in milliseconds. This value is returned only when the task is in a terminal state and both the completion time and execution duration are valid. Otherwise, null is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1250</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DurationMs")
    public Long durationMs;

    /**
     * <p>The completion time in UTC RFC3339 format. Returns null if the task is not in a terminal state or the completion time is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-30T06:00:01.250Z</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("FinishedAt")
    public String finishedAt;

    /**
     * <p>The ID of the AP task instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sample-001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the DLC job to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc5yfk7eyg95lac</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The sandbox ID of the current attempt. Returns null if no matching information is found.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-example</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SandboxId")
    public String sandboxId;

    /**
     * <p>The sandbox resource summary of the current attempt. Returns null if no matching information is found.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SandboxInfo")
    public AgentSandboxInfo sandboxInfo;

    /**
     * <p>The status of the AP task.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The AP task tags, returned in the original content and order. Returns [] if the value is missing, null, or an empty array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;scenario:swe&quot;]</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>The name of the AP template.</p>
     * 
     * <strong>example:</strong>
     * <p>swe-bench</p>
     */
    @NameInMap("Template")
    public String template;

    public static AgentPlatformJob build(java.util.Map<String, ?> map) throws Exception {
        AgentPlatformJob self = new AgentPlatformJob();
        return TeaModel.build(map, self);
    }

    public AgentPlatformJob setAgentJobId(String agentJobId) {
        this.agentJobId = agentJobId;
        return this;
    }
    public String getAgentJobId() {
        return this.agentJobId;
    }

    public AgentPlatformJob setAttempt(Long attempt) {
        this.attempt = attempt;
        return this;
    }
    public Long getAttempt() {
        return this.attempt;
    }

    public AgentPlatformJob setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AgentPlatformJob setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }
    public Long getDurationMs() {
        return this.durationMs;
    }

    public AgentPlatformJob setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public AgentPlatformJob setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AgentPlatformJob setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AgentPlatformJob setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
        return this;
    }
    public String getSandboxId() {
        return this.sandboxId;
    }

    public AgentPlatformJob setSandboxInfo(AgentSandboxInfo sandboxInfo) {
        this.sandboxInfo = sandboxInfo;
        return this;
    }
    public AgentSandboxInfo getSandboxInfo() {
        return this.sandboxInfo;
    }

    public AgentPlatformJob setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentPlatformJob setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public AgentPlatformJob setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
