// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RollbackWorkflowInstanceParam extends TeaModel {
    // ExecutionContext
    @NameInMap("executionContext")
    public String executionContext;

    // StartRollbackActivityInstanceId
    @NameInMap("startRollbackActivityInstanceId")
    public Long startRollbackActivityInstanceId;

    // WorkflowInstanceId
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    // WorkflowRollbackPolicy
    @NameInMap("workflowRollbackPolicy")
    public String workflowRollbackPolicy;

    public static RollbackWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowInstanceParam self = new RollbackWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowInstanceParam setExecutionContext(String executionContext) {
        this.executionContext = executionContext;
        return this;
    }
    public String getExecutionContext() {
        return this.executionContext;
    }

    public RollbackWorkflowInstanceParam setStartRollbackActivityInstanceId(Long startRollbackActivityInstanceId) {
        this.startRollbackActivityInstanceId = startRollbackActivityInstanceId;
        return this;
    }
    public Long getStartRollbackActivityInstanceId() {
        return this.startRollbackActivityInstanceId;
    }

    public RollbackWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public RollbackWorkflowInstanceParam setWorkflowRollbackPolicy(String workflowRollbackPolicy) {
        this.workflowRollbackPolicy = workflowRollbackPolicy;
        return this;
    }
    public String getWorkflowRollbackPolicy() {
        return this.workflowRollbackPolicy;
    }

}
