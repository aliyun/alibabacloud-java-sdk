// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationConfigmapRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static DeleteLDCFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationConfigmapRequest self = new DeleteLDCFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLDCFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteLDCFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
