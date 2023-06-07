// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TaskStatus extends TeaModel {
    @NameInMap("executionDetails")
    public java.util.List<String> executionDetails;

    @NameInMap("invocations")
    public java.util.List<TaskInvocation> invocations;

    @NameInMap("phase")
    public String phase;

    @NameInMap("statusGeneration")
    public Long statusGeneration;

    public static TaskStatus build(java.util.Map<String, ?> map) throws Exception {
        TaskStatus self = new TaskStatus();
        return TeaModel.build(map, self);
    }

    public TaskStatus setExecutionDetails(java.util.List<String> executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }
    public java.util.List<String> getExecutionDetails() {
        return this.executionDetails;
    }

    public TaskStatus setInvocations(java.util.List<TaskInvocation> invocations) {
        this.invocations = invocations;
        return this;
    }
    public java.util.List<TaskInvocation> getInvocations() {
        return this.invocations;
    }

    public TaskStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public TaskStatus setStatusGeneration(Long statusGeneration) {
        this.statusGeneration = statusGeneration;
        return this;
    }
    public Long getStatusGeneration() {
        return this.statusGeneration;
    }

}
