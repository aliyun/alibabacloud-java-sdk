// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteWorkflowsShrinkRequest extends TeaModel {
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
     * <p>xxljob-a1804a3226d</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteJobs")
    public Boolean deleteJobs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkflowIds")
    public String workflowIdsShrink;

    public static DeleteWorkflowsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowsShrinkRequest self = new DeleteWorkflowsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteWorkflowsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteWorkflowsShrinkRequest setDeleteJobs(Boolean deleteJobs) {
        this.deleteJobs = deleteJobs;
        return this;
    }
    public Boolean getDeleteJobs() {
        return this.deleteJobs;
    }

    public DeleteWorkflowsShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
