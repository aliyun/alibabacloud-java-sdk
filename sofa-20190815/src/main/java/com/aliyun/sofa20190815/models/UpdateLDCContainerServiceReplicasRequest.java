// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCContainerServiceReplicasRequest extends TeaModel {
    @NameInMap("FixedReplicaElasticConfigJsonStr")
    public String fixedReplicaElasticConfigJsonStr;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCContainerServiceReplicasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCContainerServiceReplicasRequest self = new UpdateLDCContainerServiceReplicasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCContainerServiceReplicasRequest setFixedReplicaElasticConfigJsonStr(String fixedReplicaElasticConfigJsonStr) {
        this.fixedReplicaElasticConfigJsonStr = fixedReplicaElasticConfigJsonStr;
        return this;
    }
    public String getFixedReplicaElasticConfigJsonStr() {
        return this.fixedReplicaElasticConfigJsonStr;
    }

    public UpdateLDCContainerServiceReplicasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCContainerServiceReplicasRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateLDCContainerServiceReplicasRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLDCContainerServiceReplicasRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateLDCContainerServiceReplicasRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
