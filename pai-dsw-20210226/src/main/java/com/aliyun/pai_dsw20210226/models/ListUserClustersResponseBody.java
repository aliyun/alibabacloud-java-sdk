// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListUserClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<Cluster> clusters;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserClustersResponseBody self = new ListUserClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserClustersResponseBody setClusters(java.util.List<Cluster> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<Cluster> getClusters() {
        return this.clusters;
    }

    public ListUserClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
