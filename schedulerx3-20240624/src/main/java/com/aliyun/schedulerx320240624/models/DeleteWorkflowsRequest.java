// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteWorkflowsRequest extends TeaModel {
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
    public java.util.List<Long> workflowIds;

    public static DeleteWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowsRequest self = new DeleteWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteWorkflowsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteWorkflowsRequest setDeleteJobs(Boolean deleteJobs) {
        this.deleteJobs = deleteJobs;
        return this;
    }
    public Boolean getDeleteJobs() {
        return this.deleteJobs;
    }

    public DeleteWorkflowsRequest setWorkflowIds(java.util.List<Long> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<Long> getWorkflowIds() {
        return this.workflowIds;
    }

}
