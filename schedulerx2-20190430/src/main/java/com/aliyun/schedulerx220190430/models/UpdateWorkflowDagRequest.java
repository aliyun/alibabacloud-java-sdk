// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDagRequest extends TeaModel {
    /**
     * <p>The definition of the workflow\&quot;s directed acyclic graph (DAG), including nodes and edges, as a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nodes&quot;:[{&quot;id&quot;:2300691},{&quot;id&quot;:10518089},{&quot;id&quot;:1758851}],&quot;edges&quot;:[{&quot;source&quot;:10518089,&quot;target&quot;:1758851},{&quot;source&quot;:10518089,&quot;target&quot;:2300691}]}</p>
     */
    @NameInMap("DagJson")
    public String dagJson;

    /**
     * <p>The Application Group ID. You can find this ID on the <strong>Application Management</strong> page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The Namespace ID. You can obtain the ID on the <strong>Namespaces</strong> page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required only for specific third-party integrations.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
