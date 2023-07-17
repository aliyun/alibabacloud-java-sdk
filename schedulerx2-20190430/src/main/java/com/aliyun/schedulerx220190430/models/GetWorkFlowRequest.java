// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkFlowRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region information.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the workflow.</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static GetWorkFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkFlowRequest self = new GetWorkFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkFlowRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetWorkFlowRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetWorkFlowRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetWorkFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetWorkFlowRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
