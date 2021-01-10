// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFederationSpannerClusterRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCFederationSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFederationSpannerClusterRequest self = new QueryLDCFederationSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCFederationSpannerClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QueryLDCFederationSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
