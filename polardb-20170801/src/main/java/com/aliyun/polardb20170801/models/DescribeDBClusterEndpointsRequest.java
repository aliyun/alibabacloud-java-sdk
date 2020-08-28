// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    public static DescribeDBClusterEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsRequest self = new DescribeDBClusterEndpointsRequest();
        return TeaModel.build(map, self);
    }

}
