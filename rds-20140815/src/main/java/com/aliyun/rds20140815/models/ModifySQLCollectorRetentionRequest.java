// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorRetentionRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConfigValue")
    @Validation(required = true)
    public String configValue;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifySQLCollectorRetentionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorRetentionRequest self = new ModifySQLCollectorRetentionRequest();
        return TeaModel.build(map, self);
    }

}
