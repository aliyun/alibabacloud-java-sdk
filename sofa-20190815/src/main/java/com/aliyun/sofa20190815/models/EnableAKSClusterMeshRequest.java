// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableAKSClusterMeshRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("Workspace")
    public String workspace;

    public static EnableAKSClusterMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAKSClusterMeshRequest self = new EnableAKSClusterMeshRequest();
        return TeaModel.build(map, self);
    }

    public EnableAKSClusterMeshRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public EnableAKSClusterMeshRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
