// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("BackupPeriod")
    public String backupPeriod;

    @NameInMap("BackupPlanBegin")
    public String backupPlanBegin;

    @NameInMap("BackupSetRetention")
    public Integer backupSetRetention;

    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("BackupWay")
    public String backupWay;

    @NameInMap("ForceCleanOnHighSpaceUsage")
    public Integer forceCleanOnHighSpaceUsage;

    @NameInMap("IsEnabled")
    public Integer isEnabled;

    @NameInMap("LocalLogRetention")
    public Integer localLogRetention;

    @NameInMap("RemoveLogRetention")
    public Integer removeLogRetention;

    @NameInMap("LogLocalRetentionSpace")
    public Integer logLocalRetentionSpace;

    public static UpdateBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPolicyRequest self = new UpdateBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBackupPolicyRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdateBackupPolicyRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public UpdateBackupPolicyRequest setBackupPlanBegin(String backupPlanBegin) {
        this.backupPlanBegin = backupPlanBegin;
        return this;
    }
    public String getBackupPlanBegin() {
        return this.backupPlanBegin;
    }

    public UpdateBackupPolicyRequest setBackupSetRetention(Integer backupSetRetention) {
        this.backupSetRetention = backupSetRetention;
        return this;
    }
    public Integer getBackupSetRetention() {
        return this.backupSetRetention;
    }

    public UpdateBackupPolicyRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public UpdateBackupPolicyRequest setBackupWay(String backupWay) {
        this.backupWay = backupWay;
        return this;
    }
    public String getBackupWay() {
        return this.backupWay;
    }

    public UpdateBackupPolicyRequest setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
        this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
        return this;
    }
    public Integer getForceCleanOnHighSpaceUsage() {
        return this.forceCleanOnHighSpaceUsage;
    }

    public UpdateBackupPolicyRequest setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Integer getIsEnabled() {
        return this.isEnabled;
    }

    public UpdateBackupPolicyRequest setLocalLogRetention(Integer localLogRetention) {
        this.localLogRetention = localLogRetention;
        return this;
    }
    public Integer getLocalLogRetention() {
        return this.localLogRetention;
    }

    public UpdateBackupPolicyRequest setRemoveLogRetention(Integer removeLogRetention) {
        this.removeLogRetention = removeLogRetention;
        return this;
    }
    public Integer getRemoveLogRetention() {
        return this.removeLogRetention;
    }

    public UpdateBackupPolicyRequest setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
        this.logLocalRetentionSpace = logLocalRetentionSpace;
        return this;
    }
    public Integer getLogLocalRetentionSpace() {
        return this.logLocalRetentionSpace;
    }

}
