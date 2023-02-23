// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class EnableWorkflowRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the application ID on the Application Management page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the workflow.</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static EnableWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableWorkflowRequest self = new EnableWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public EnableWorkflowRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public EnableWorkflowRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public EnableWorkflowRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public EnableWorkflowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableWorkflowRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
