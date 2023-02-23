// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDagRequest extends TeaModel {
    @NameInMap("DagJson")
    public String dagJson;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

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
