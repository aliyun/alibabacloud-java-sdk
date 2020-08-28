// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("SQLCollectorStatus")
    @Validation(required = true)
    public String SQLCollectorStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifySQLCollectorPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyRequest self = new ModifySQLCollectorPolicyRequest();
        return TeaModel.build(map, self);
    }

}
