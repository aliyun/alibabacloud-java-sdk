// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationSpannerClusterRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCFederationSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationSpannerClusterRequest self = new ListLDCFederationSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationSpannerClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListLDCFederationSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
