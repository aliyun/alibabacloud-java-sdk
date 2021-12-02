// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailRequest extends TeaModel {
    @NameInMap("ClusterInstanceId")
    public String clusterInstanceId;

    public static DescribeClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailRequest self = new DescribeClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailRequest setClusterInstanceId(String clusterInstanceId) {
        this.clusterInstanceId = clusterInstanceId;
        return this;
    }
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

}
