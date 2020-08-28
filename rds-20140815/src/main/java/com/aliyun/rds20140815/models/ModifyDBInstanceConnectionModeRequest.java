// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionModeRequest extends TeaModel {
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

    @NameInMap("ConnectionMode")
    @Validation(required = true)
    public String connectionMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDBInstanceConnectionModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionModeRequest self = new ModifyDBInstanceConnectionModeRequest();
        return TeaModel.build(map, self);
    }

}
