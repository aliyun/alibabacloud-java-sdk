// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
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

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("Category")
    public String category;

    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static MigrateToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneRequest self = new MigrateToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

}
