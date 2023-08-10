// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceViaEndpointRequest extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    public static DescribeDBInstanceViaEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceViaEndpointRequest self = new DescribeDBInstanceViaEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceViaEndpointRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
