// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationNamespaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static DeleteLDCFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationNamespaceRequest self = new DeleteLDCFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLDCFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
