// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteLDCFederationSpannerClusterRequest extends TeaModel {
    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    @NameInMap("ClusterNamesRepeatList")
    public java.util.List<String> clusterNamesRepeatList;

    public static BatchDeleteLDCFederationSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLDCFederationSpannerClusterRequest self = new BatchDeleteLDCFederationSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLDCFederationSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public BatchDeleteLDCFederationSpannerClusterRequest setClusterNamesRepeatList(java.util.List<String> clusterNamesRepeatList) {
        this.clusterNamesRepeatList = clusterNamesRepeatList;
        return this;
    }
    public java.util.List<String> getClusterNamesRepeatList() {
        return this.clusterNamesRepeatList;
    }

}
