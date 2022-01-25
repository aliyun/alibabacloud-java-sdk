// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkFlowRequest extends TeaModel {
    // 应用分组ID
    @NameInMap("GroupId")
    public String groupId;

    // 命名空间uid
    @NameInMap("Namespace")
    public String namespace;

    // 命名空间来源
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    // 工作流ID
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
