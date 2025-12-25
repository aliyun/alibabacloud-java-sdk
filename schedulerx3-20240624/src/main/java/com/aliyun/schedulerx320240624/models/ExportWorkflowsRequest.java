// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ExportWorkflowsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>A short description of struct</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("WorkflowId")
    public java.util.List<Long> workflowId;

    public static ExportWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkflowsRequest self = new ExportWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public ExportWorkflowsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExportWorkflowsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExportWorkflowsRequest setWorkflowId(java.util.List<Long> workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public java.util.List<Long> getWorkflowId() {
        return this.workflowId;
    }

}
