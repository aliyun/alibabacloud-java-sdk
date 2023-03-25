// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCnnfStatusDetailRequest extends TeaModel {
    /**
     * <p>An array that consists of the ID of the cluster.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    public static ListClusterCnnfStatusDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterCnnfStatusDetailRequest self = new ListClusterCnnfStatusDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterCnnfStatusDetailRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

}
