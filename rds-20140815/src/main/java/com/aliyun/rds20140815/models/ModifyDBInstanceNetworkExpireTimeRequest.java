// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkExpireTimeRequest extends TeaModel {
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

    @NameInMap("ConnectionString")
    @Validation(required = true)
    public String connectionString;

    @NameInMap("ClassicExpiredDays")
    @Validation(required = true)
    public Integer classicExpiredDays;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDBInstanceNetworkExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkExpireTimeRequest self = new ModifyDBInstanceNetworkExpireTimeRequest();
        return TeaModel.build(map, self);
    }

}
