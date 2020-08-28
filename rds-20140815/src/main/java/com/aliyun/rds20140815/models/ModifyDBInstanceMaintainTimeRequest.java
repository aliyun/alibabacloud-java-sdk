// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMaintainTimeRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("MaintainTime")
    @Validation(required = true)
    public String maintainTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDBInstanceMaintainTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMaintainTimeRequest self = new ModifyDBInstanceMaintainTimeRequest();
        return TeaModel.build(map, self);
    }

}
