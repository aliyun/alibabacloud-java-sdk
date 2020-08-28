// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesRequest extends TeaModel {
    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBClusterAvailableResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAvailableResourcesRequest self = new DescribeDBClusterAvailableResourcesRequest();
        return TeaModel.build(map, self);
    }

}
