// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class SetWfInstanceSuccessRequest extends TeaModel {
    /**
     * <p>The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
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
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The workflow instance ID.</p>
     */
    @NameInMap("WfInstanceId")
    public Long wfInstanceId;

    /**
     * <p>The workflow ID.</p>
     */
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
