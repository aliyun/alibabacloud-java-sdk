// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowDAGPreviewRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The unique identifier for the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The version of the workflow DAG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DagVersion")
    public String dagVersion;

    /**
     * <p>The unique identifier for the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static GetWorkflowDAGPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDAGPreviewRequest self = new GetWorkflowDAGPreviewRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDAGPreviewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetWorkflowDAGPreviewRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetWorkflowDAGPreviewRequest setDagVersion(String dagVersion) {
        this.dagVersion = dagVersion;
        return this;
    }
    public String getDagVersion() {
        return this.dagVersion;
    }

    public GetWorkflowDAGPreviewRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
