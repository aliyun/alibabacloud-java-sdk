// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeRequest extends TeaModel {
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

    @NameInMap("RetainClassic")
    public String retainClassic;

    @NameInMap("ClassicExpiredDays")
    public String classicExpiredDays;

    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    public String instanceNetworkType;

    @NameInMap("ReadWriteSplittingClassicExpiredDays")
    public Integer readWriteSplittingClassicExpiredDays;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ReadWriteSplittingPrivateIpAddress")
    public String readWriteSplittingPrivateIpAddress;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDBInstanceNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeRequest self = new ModifyDBInstanceNetworkTypeRequest();
        return TeaModel.build(map, self);
    }

}
