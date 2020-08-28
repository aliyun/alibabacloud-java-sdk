// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("Privileges")
    @Validation(required = true)
    public String privileges;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static GrantOperatorPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionRequest self = new GrantOperatorPermissionRequest();
        return TeaModel.build(map, self);
    }

}
