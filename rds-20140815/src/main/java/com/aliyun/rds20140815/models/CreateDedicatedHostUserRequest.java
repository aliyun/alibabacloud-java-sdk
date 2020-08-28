// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostUserRequest extends TeaModel {
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

    @NameInMap("UserPassword")
    @Validation(required = true)
    public String userPassword;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateDedicatedHostUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostUserRequest self = new CreateDedicatedHostUserRequest();
        return TeaModel.build(map, self);
    }

}
