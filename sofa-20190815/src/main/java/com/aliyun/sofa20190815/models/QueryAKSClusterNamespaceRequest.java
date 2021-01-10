// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSClusterNamespaceRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static QueryAKSClusterNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSClusterNamespaceRequest self = new QueryAKSClusterNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAKSClusterNamespaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
