// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceViaEndpointRequest extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeDBInstanceViaEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
