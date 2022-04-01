// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryWorkflowInstanceParam extends TeaModel {
    // ExecutionContext
    @NameInMap("executionContext")
    public String executionContext;

    // SignalBizCodeCollectionSignalBizCodeCollection
    @NameInMap("signalBizCodeCollection")
    public String signalBizCodeCollection;

    // startActivityInstanceId
    @NameInMap("startActivityInstanceId")
    public Long startActivityInstanceId;

    // workflowInstanceId
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    // WorkflowRetryPolicy
    @NameInMap("workflowRetryPolicy")
    public String workflowRetryPolicy;

    public static RetryWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowInstanceParam self = new RetryWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowInstanceParam setExecutionContext(String executionContext) {
        this.executionContext = executionContext;
        return this;
    }
    public String getExecutionContext() {
        return this.executionContext;
    }

    public RetryWorkflowInstanceParam setSignalBizCodeCollection(String signalBizCodeCollection) {
        this.signalBizCodeCollection = signalBizCodeCollection;
        return this;
    }
    public String getSignalBizCodeCollection() {
        return this.signalBizCodeCollection;
    }

    public RetryWorkflowInstanceParam setStartActivityInstanceId(Long startActivityInstanceId) {
        this.startActivityInstanceId = startActivityInstanceId;
        return this;
    }
    public Long getStartActivityInstanceId() {
        return this.startActivityInstanceId;
    }

    public RetryWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public RetryWorkflowInstanceParam setWorkflowRetryPolicy(String workflowRetryPolicy) {
        this.workflowRetryPolicy = workflowRetryPolicy;
        return this;
    }
    public String getWorkflowRetryPolicy() {
        return this.workflowRetryPolicy;
    }

}
