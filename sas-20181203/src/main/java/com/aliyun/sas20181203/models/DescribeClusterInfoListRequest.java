// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterInfoListRequest extends TeaModel {
    @NameInMap("Target")
    public String target;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Type")
    public String type;

    public static DescribeClusterInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInfoListRequest self = new DescribeClusterInfoListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInfoListRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public DescribeClusterInfoListRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeClusterInfoListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
