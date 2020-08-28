// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeCharacterSetNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameRequest self = new DescribeCharacterSetNameRequest();
        return TeaModel.build(map, self);
    }

}
