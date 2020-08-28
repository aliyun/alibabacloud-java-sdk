// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostClassesRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("StorageType")
    public String storageType;

    public static DescribeAvailableDedicatedHostClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostClassesRequest self = new DescribeAvailableDedicatedHostClassesRequest();
        return TeaModel.build(map, self);
    }

}
