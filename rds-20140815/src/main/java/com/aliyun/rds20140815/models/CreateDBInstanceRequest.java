// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    public Integer DBInstanceStorage;

    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    @NameInMap("DBInstanceNetType")
    @Validation(required = true)
    public String DBInstanceNetType;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("SecurityIPList")
    @Validation(required = true)
    public String securityIPList;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("ConnectionMode")
    public String connectionMode;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("RoleARN")
    public String roleARN;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("Category")
    public String category;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

}
