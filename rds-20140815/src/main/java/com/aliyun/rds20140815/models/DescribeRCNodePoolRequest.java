// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNodePoolRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NodePoolId")
    public String nodePoolId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNodePoolRequest self = new DescribeRCNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRCNodePoolRequest setNodePoolId(String nodePoolId) {
        this.nodePoolId = nodePoolId;
        return this;
    }
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public DescribeRCNodePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
