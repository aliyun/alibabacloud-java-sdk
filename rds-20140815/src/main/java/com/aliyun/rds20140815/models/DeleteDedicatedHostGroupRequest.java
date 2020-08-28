// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDedicatedHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostGroupRequest self = new DeleteDedicatedHostGroupRequest();
        return TeaModel.build(map, self);
    }

}
