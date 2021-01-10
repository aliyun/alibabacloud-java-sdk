// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationNamespaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static GetLDCFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationNamespaceRequest self = new GetLDCFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLDCFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
