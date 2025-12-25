// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDisableWorkflowsRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkflowIds")
    public java.util.List<Long> workflowIds;

    public static OperateDisableWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDisableWorkflowsRequest self = new OperateDisableWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public OperateDisableWorkflowsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateDisableWorkflowsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateDisableWorkflowsRequest setWorkflowIds(java.util.List<Long> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<Long> getWorkflowIds() {
        return this.workflowIds;
    }

}
