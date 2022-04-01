// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckClusterByClusterIdsParam extends TeaModel {
    // clusterIds
    @NameInMap("clusterIds")
    public java.util.List<String> clusterIds;

    public static ListClusterAckClusterByClusterIdsParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckClusterByClusterIdsParam self = new ListClusterAckClusterByClusterIdsParam();
        return TeaModel.build(map, self);
    }

    public ListClusterAckClusterByClusterIdsParam setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

}
