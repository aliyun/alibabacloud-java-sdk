// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

    @NameInMap("DbNames")
    @Validation(required = true)
    public String dbNames;

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
    public String usedTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    public static RecoveryDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoveryDBInstanceRequest self = new RecoveryDBInstanceRequest();
        return TeaModel.build(map, self);
    }

}
