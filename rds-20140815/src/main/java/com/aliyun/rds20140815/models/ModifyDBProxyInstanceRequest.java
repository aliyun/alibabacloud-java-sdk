// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceRequest extends TeaModel {
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

    @NameInMap("DBProxyInstanceType")
    @Validation(required = true)
    public String DBProxyInstanceType;

    @NameInMap("DBProxyInstanceNum")
    @Validation(required = true)
    public String DBProxyInstanceNum;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDBProxyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceRequest self = new ModifyDBProxyInstanceRequest();
        return TeaModel.build(map, self);
    }

}
