// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DropDedicatedHostUserRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DedicatedHostName")
    @Validation(required = true)
    public String dedicatedHostName;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("RegionId")
    public String regionId;

    public static DropDedicatedHostUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DropDedicatedHostUserRequest self = new DropDedicatedHostUserRequest();
        return TeaModel.build(map, self);
    }

}
