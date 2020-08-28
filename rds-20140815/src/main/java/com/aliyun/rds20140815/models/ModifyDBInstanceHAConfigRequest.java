// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SyncMode")
    @Validation(required = true)
    public String syncMode;

    @NameInMap("HAMode")
    @Validation(required = true)
    public String HAMode;

    @NameInMap("DbInstanceId")
    @Validation(required = true)
    public String dbInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDBInstanceHAConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceHAConfigRequest self = new ModifyDBInstanceHAConfigRequest();
        return TeaModel.build(map, self);
    }

}
