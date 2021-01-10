// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationSecretRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static DeleteLDCFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationSecretRequest self = new DeleteLDCFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLDCFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteLDCFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
