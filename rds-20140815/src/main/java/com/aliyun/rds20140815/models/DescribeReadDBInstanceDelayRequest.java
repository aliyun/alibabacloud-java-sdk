// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayRequest extends TeaModel {
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

    @NameInMap("ReadInstanceId")
    @Validation(required = true)
    public String readInstanceId;

    public static DescribeReadDBInstanceDelayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayRequest self = new DescribeReadDBInstanceDelayRequest();
        return TeaModel.build(map, self);
    }

}
