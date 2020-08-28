// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class LockAccountRequest extends TeaModel {
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

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    public static LockAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        LockAccountRequest self = new LockAccountRequest();
        return TeaModel.build(map, self);
    }

}
