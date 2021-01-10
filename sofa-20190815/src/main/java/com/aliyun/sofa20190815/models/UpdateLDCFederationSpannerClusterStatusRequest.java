// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSpannerClusterStatusRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterStatus")
    public String clusterStatus;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCFederationSpannerClusterStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSpannerClusterStatusRequest self = new UpdateLDCFederationSpannerClusterStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSpannerClusterStatusRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateLDCFederationSpannerClusterStatusRequest setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public UpdateLDCFederationSpannerClusterStatusRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
