// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostImageCategoriesRequest extends TeaModel {
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

    @NameInMap("HostGroup")
    @Validation(required = true)
    public String hostGroup;

    public static DescribeDedicatedHostImageCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostImageCategoriesRequest self = new DescribeDedicatedHostImageCategoriesRequest();
        return TeaModel.build(map, self);
    }

}
