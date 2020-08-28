// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHARequest extends TeaModel {
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

    @NameInMap("NodeId")
    @Validation(required = true)
    public String nodeId;

    @NameInMap("Force")
    public String force;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    public static SwitchDBInstanceHARequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHARequest self = new SwitchDBInstanceHARequest();
        return TeaModel.build(map, self);
    }

}
