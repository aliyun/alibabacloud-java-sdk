// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyRequest extends TeaModel {
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

    @NameInMap("ColdDataBackupInterval")
    public Integer coldDataBackupInterval;

    @NameInMap("ColdDataBackupRetention")
    public Integer coldDataBackupRetention;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ForceCleanOnHighSpaceUsage")
    public Integer forceCleanOnHighSpaceUsage;

    @NameInMap("IsEnabled")
    public Integer isEnabled;

    @NameInMap("LocalLogRetention")
    public Integer localLogRetention;

    @NameInMap("LocalLogRetentionNumber")
    public Integer localLogRetentionNumber;

    @NameInMap("LogLocalRetentionSpace")
    public Integer logLocalRetentionSpace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveLogRetention")
    public Integer removeLogRetention;

    public static UpdateBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPolicyRequest self = new UpdateBackupPolicyRequest();
        return TeaModel.build(map, self);
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

    public UpdateBackupPolicyRequest setColdDataBackupInterval(Integer coldDataBackupInterval) {
        this.coldDataBackupInterval = coldDataBackupInterval;
        return this;
    }
    public Integer getColdDataBackupInterval() {
        return this.coldDataBackupInterval;
    }

    public UpdateBackupPolicyRequest setColdDataBackupRetention(Integer coldDataBackupRetention) {
        this.coldDataBackupRetention = coldDataBackupRetention;
        return this;
    }
    public Integer getColdDataBackupRetention() {
        return this.coldDataBackupRetention;
    }

    public UpdateBackupPolicyRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
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

    public UpdateBackupPolicyRequest setLocalLogRetentionNumber(Integer localLogRetentionNumber) {
        this.localLogRetentionNumber = localLogRetentionNumber;
        return this;
    }
    public Integer getLocalLogRetentionNumber() {
        return this.localLogRetentionNumber;
    }

    public UpdateBackupPolicyRequest setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
        this.logLocalRetentionSpace = logLocalRetentionSpace;
        return this;
    }
    public Integer getLogLocalRetentionSpace() {
        return this.logLocalRetentionSpace;
    }

    public UpdateBackupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBackupPolicyRequest setRemoveLogRetention(Integer removeLogRetention) {
        this.removeLogRetention = removeLogRetention;
        return this;
    }
    public Integer getRemoveLogRetention() {
        return this.removeLogRetention;
    }

}
