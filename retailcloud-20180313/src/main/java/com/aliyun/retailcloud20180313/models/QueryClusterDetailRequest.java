// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class QueryClusterDetailRequest extends TeaModel {
    @NameInMap("ClusterInstanceId")
    public String clusterInstanceId;

    public static QueryClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailRequest self = new QueryClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterDetailRequest setClusterInstanceId(String clusterInstanceId) {
        this.clusterInstanceId = clusterInstanceId;
        return this;
    }
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

}
