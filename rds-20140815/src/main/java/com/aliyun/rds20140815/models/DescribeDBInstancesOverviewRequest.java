// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ProxyId")
    public String proxyId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("Expired")
    public String expired;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeDBInstancesOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesOverviewRequest self = new DescribeDBInstancesOverviewRequest();
        return TeaModel.build(map, self);
    }

}
