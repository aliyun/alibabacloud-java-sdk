// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("UsedTime")
    public Integer usedTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("Category")
    public String category;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("RestoreTable")
    public String restoreTable;

    @NameInMap("TableMeta")
    public String tableMeta;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("BackupType")
    public String backupType;

    public static CloneDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDBInstanceRequest self = new CloneDBInstanceRequest();
        return TeaModel.build(map, self);
    }

}
