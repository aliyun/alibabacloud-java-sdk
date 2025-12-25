// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDisableWorkflowsShrinkRequest extends TeaModel {
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
    public String workflowIdsShrink;

    public static OperateDisableWorkflowsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDisableWorkflowsShrinkRequest self = new OperateDisableWorkflowsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateDisableWorkflowsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateDisableWorkflowsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateDisableWorkflowsShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
