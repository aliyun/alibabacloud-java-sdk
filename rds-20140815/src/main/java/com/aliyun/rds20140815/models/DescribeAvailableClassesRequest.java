// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    public String instanceChargeType;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("DBInstanceStorageType")
    @Validation(required = true)
    public String DBInstanceStorageType;

    @NameInMap("Category")
    @Validation(required = true)
    public String category;

    public static DescribeAvailableClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableClassesRequest self = new DescribeAvailableClassesRequest();
        return TeaModel.build(map, self);
    }

}
