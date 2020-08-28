// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostUserRequest extends TeaModel {
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

    @NameInMap("OldPassword")
    @Validation(required = true)
    public String oldPassword;

    @NameInMap("NewPassword")
    @Validation(required = true)
    public String newPassword;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDedicatedHostUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostUserRequest self = new ModifyDedicatedHostUserRequest();
        return TeaModel.build(map, self);
    }

}
