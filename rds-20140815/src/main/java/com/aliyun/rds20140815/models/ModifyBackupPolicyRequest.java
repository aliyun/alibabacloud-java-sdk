// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    @NameInMap("ArchiveBackupKeepCount")
    public Integer archiveBackupKeepCount;

    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    @NameInMap("BackupInterval")
    public String backupInterval;

    @NameInMap("BackupLog")
    public String backupLog;

    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupPolicyMode")
    public String backupPolicyMode;

    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    @NameInMap("Category")
    public String category;

    @NameInMap("CompressType")
    public String compressType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    @NameInMap("LocalLogRetentionHours")
    public String localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setArchiveBackupKeepCount(Integer archiveBackupKeepCount) {
        this.archiveBackupKeepCount = archiveBackupKeepCount;
        return this;
    }
    public Integer getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    public ModifyBackupPolicyRequest setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
        this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
        return this;
    }
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    public ModifyBackupPolicyRequest setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
        this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
        return this;
    }
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public ModifyBackupPolicyRequest setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public ModifyBackupPolicyRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public ModifyBackupPolicyRequest setBackupPolicyMode(String backupPolicyMode) {
        this.backupPolicyMode = backupPolicyMode;
        return this;
    }
    public String getBackupPolicyMode() {
        return this.backupPolicyMode;
    }

    public ModifyBackupPolicyRequest setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyBackupPolicyRequest setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public ModifyBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupPolicyRequest setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyRequest setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public ModifyBackupPolicyRequest setLocalLogRetentionHours(String localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public String getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public ModifyBackupPolicyRequest setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public ModifyBackupPolicyRequest setLogBackupFrequency(String logBackupFrequency) {
        this.logBackupFrequency = logBackupFrequency;
        return this;
    }
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    public ModifyBackupPolicyRequest setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public ModifyBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyBackupPolicyRequest setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public ModifyBackupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
