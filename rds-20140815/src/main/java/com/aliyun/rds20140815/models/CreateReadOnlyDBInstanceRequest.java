// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReadOnlyDBInstanceRequest extends TeaModel {
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

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    public Integer DBInstanceStorage;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Category")
    public String category;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    public static CreateReadOnlyDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyDBInstanceRequest self = new CreateReadOnlyDBInstanceRequest();
        return TeaModel.build(map, self);
    }

}
