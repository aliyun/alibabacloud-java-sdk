// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorRetentionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSQLCollectorRetentionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorRetentionRequest self = new DescribeSQLCollectorRetentionRequest();
        return TeaModel.build(map, self);
    }

}
