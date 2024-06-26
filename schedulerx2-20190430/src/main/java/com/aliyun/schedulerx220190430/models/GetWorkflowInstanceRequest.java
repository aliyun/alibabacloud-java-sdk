// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceRequest extends TeaModel {
    /**
     * <p>The application group ID. You can obtain the ID on the Application Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The workflow instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("WfInstanceId")
    public Long wfInstanceId;

    /**
     * <p>The workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static GetWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceRequest self = new GetWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetWorkflowInstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetWorkflowInstanceRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetWorkflowInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetWorkflowInstanceRequest setWfInstanceId(Long wfInstanceId) {
        this.wfInstanceId = wfInstanceId;
        return this;
    }
    public Long getWfInstanceId() {
        return this.wfInstanceId;
    }

    public GetWorkflowInstanceRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
