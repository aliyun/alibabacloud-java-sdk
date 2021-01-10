// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLDCContainerserviceDeploymentRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("GroupCount")
    public Long groupCount;

    @NameInMap("GroupStrategy")
    public String groupStrategy;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static RollbackLDCContainerserviceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackLDCContainerserviceDeploymentRequest self = new RollbackLDCContainerserviceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public RollbackLDCContainerserviceDeploymentRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public RollbackLDCContainerserviceDeploymentRequest setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Long getGroupCount() {
        return this.groupCount;
    }

    public RollbackLDCContainerserviceDeploymentRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public RollbackLDCContainerserviceDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RollbackLDCContainerserviceDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RollbackLDCContainerserviceDeploymentRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RollbackLDCContainerserviceDeploymentRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RollbackLDCContainerserviceDeploymentRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public RollbackLDCContainerserviceDeploymentRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
