// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostZonesRequest extends TeaModel {
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

    public static DescribeAvailableDedicatedHostZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostZonesRequest self = new DescribeAvailableDedicatedHostZonesRequest();
        return TeaModel.build(map, self);
    }

}
