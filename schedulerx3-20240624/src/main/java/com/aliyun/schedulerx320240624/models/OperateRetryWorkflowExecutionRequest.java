// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRetryWorkflowExecutionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyFailed")
    public Boolean onlyFailed;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1450568762586578000</p>
     */
    @NameInMap("WorkflowExecutionId")
    public Long workflowExecutionId;

    public static OperateRetryWorkflowExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateRetryWorkflowExecutionRequest self = new OperateRetryWorkflowExecutionRequest();
        return TeaModel.build(map, self);
    }

    public OperateRetryWorkflowExecutionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateRetryWorkflowExecutionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateRetryWorkflowExecutionRequest setOnlyFailed(Boolean onlyFailed) {
        this.onlyFailed = onlyFailed;
        return this;
    }
    public Boolean getOnlyFailed() {
        return this.onlyFailed;
    }

    public OperateRetryWorkflowExecutionRequest setWorkflowExecutionId(Long workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
        return this;
    }
    public Long getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

}
