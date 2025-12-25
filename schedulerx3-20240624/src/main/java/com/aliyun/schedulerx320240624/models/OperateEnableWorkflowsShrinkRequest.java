// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateEnableWorkflowsShrinkRequest extends TeaModel {
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
    public String workflowIdsShrink;

    public static OperateEnableWorkflowsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateEnableWorkflowsShrinkRequest self = new OperateEnableWorkflowsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateEnableWorkflowsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateEnableWorkflowsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateEnableWorkflowsShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
