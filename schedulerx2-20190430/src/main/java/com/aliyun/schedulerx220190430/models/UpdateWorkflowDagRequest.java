// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDagRequest extends TeaModel {
    /**
     * <p>The directed acyclic graph (DAG) of the workflow, including the information about the nodes and the edges. Specify the value of this parameter in the JSON format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagJson")
    public String dagJson;

    /**
     * <p>The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The workflow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static UpdateWorkflowDagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDagRequest self = new UpdateWorkflowDagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDagRequest setDagJson(String dagJson) {
        this.dagJson = dagJson;
        return this;
    }
    public String getDagJson() {
        return this.dagJson;
    }

    public UpdateWorkflowDagRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateWorkflowDagRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateWorkflowDagRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public UpdateWorkflowDagRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWorkflowDagRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
