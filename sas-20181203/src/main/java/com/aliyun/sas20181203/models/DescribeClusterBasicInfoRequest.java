// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Type")
    public String type;

    public static DescribeClusterBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoRequest self = new DescribeClusterBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterBasicInfoRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeClusterBasicInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
