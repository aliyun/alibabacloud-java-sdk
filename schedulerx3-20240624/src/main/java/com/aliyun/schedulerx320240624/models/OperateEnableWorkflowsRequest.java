// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateEnableWorkflowsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxl-job-executor-sample</p>
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkflowIds")
    public java.util.List<Long> workflowIds;

    public static OperateEnableWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateEnableWorkflowsRequest self = new OperateEnableWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public OperateEnableWorkflowsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateEnableWorkflowsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateEnableWorkflowsRequest setWorkflowIds(java.util.List<Long> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<Long> getWorkflowIds() {
        return this.workflowIds;
    }

}
