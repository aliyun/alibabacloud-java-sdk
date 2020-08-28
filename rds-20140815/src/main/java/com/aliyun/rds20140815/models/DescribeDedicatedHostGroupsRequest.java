// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsRequest extends TeaModel {
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

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("ImageCategory")
    public String imageCategory;

    public static DescribeDedicatedHostGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostGroupsRequest self = new DescribeDedicatedHostGroupsRequest();
        return TeaModel.build(map, self);
    }

}
