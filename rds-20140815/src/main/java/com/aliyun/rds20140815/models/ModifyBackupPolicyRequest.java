// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
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

    @NameInMap("BackupPolicyMode")
    public String backupPolicyMode;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    @NameInMap("BackupLog")
    public String backupLog;

    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    @NameInMap("LocalLogRetentionHours")
    public String localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    @NameInMap("CompressType")
    public String compressType;

    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupKeepCount")
    public String archiveBackupKeepCount;

    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

}
