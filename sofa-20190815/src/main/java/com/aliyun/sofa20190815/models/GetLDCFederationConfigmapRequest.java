// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationConfigmapRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static GetLDCFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationConfigmapRequest self = new GetLDCFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLDCFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetLDCFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
