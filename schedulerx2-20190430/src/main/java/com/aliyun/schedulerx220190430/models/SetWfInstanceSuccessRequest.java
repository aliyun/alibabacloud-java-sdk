// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class SetWfInstanceSuccessRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("WfInstanceId")
    public Long wfInstanceId;

    @NameInMap("WorkflowId")
    public Long workflowId;

    public static SetWfInstanceSuccessRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWfInstanceSuccessRequest self = new SetWfInstanceSuccessRequest();
        return TeaModel.build(map, self);
    }

    public SetWfInstanceSuccessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetWfInstanceSuccessRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SetWfInstanceSuccessRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public SetWfInstanceSuccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetWfInstanceSuccessRequest setWfInstanceId(Long wfInstanceId) {
        this.wfInstanceId = wfInstanceId;
        return this;
    }
    public Long getWfInstanceId() {
        return this.wfInstanceId;
    }

    public SetWfInstanceSuccessRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
