// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ExportWorkflowsShrinkRequest extends TeaModel {
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
    public String workflowIdShrink;

    public static ExportWorkflowsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkflowsShrinkRequest self = new ExportWorkflowsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportWorkflowsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExportWorkflowsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExportWorkflowsShrinkRequest setWorkflowIdShrink(String workflowIdShrink) {
        this.workflowIdShrink = workflowIdShrink;
        return this;
    }
    public String getWorkflowIdShrink() {
        return this.workflowIdShrink;
    }

}
