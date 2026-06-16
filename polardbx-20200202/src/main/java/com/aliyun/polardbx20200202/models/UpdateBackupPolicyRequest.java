// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyRequest extends TeaModel {
    /**
     * <p>The backup cycle. You must specify at least 2 days. The value is a 7-digit number. From left to right, each digit indicates whether backup is enabled from Monday to Sunday. A value of 0 indicates that backup is disabled, and a value of 1 indicates that backup is enabled:</p>
     * <ul>
     * <li>First digit: Monday</li>
     * <li>Second digit: Tuesday</li>
     * <li>Third digit: Wednesday</li>
     * <li>Fourth digit: Thursday</li>
     * <li>Fifth digit: Friday</li>
     * <li>Sixth digit: Saturday</li>
     * <li>Seventh digit: Sunday.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1001000</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The start time of the daily backup, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>03:00Z</p>
     */
    @NameInMap("BackupPlanBegin")
    public String backupPlanBegin;

    /**
     * <p>The retention period of backup sets. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BackupSetRetention")
    public Integer backupSetRetention;

    /**
     * <p>The backup type. Currently, only &quot;0&quot; is supported, which indicates fast backup.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The backup method. Valid values:</p>
     * <ul>
     * <li><strong>P</strong>: physical backup</li>
     * <li><strong>L</strong>: logical backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>P</p>
     */
    @NameInMap("BackupWay")
    public String backupWay;

    /**
     * <p>The interval for cold data backups. Unit: days. Valid values: 1 to 59.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ColdDataBackupInterval")
    public Integer coldDataBackupInterval;

    /**
     * <p>The retention period for cold data backups. Unit: days. Valid values: 30 to 730.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ColdDataBackupRetention")
    public Integer coldDataBackupRetention;

    /**
     * <p>The retention period for cross-region data backups. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CrossRegionDataBackupRetention")
    public Integer crossRegionDataBackupRetention;

    @NameInMap("CrossRegionFilterValue")
    public String crossRegionFilterValue;

    /**
     * <p>The retention period for cross-region log backups. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CrossRegionLogBackupRetention")
    public Integer crossRegionLogBackupRetention;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasdyuoo</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The destination region for cross-region backup.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DestCrossRegion")
    public String destCrossRegion;

    /**
     * <p>Specifies whether to forcibly clean up binary logs when the total space usage of the instance exceeds 80% or the remaining space is less than 50 GB. The cleanup starts from the earliest logs until the total space usage drops below 80% and the remaining space exceeds 50 GB. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceCleanOnHighSpaceUsage")
    public Integer forceCleanOnHighSpaceUsage;

    /**
     * <p>Specifies whether to enable cross-region data backup. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCrossRegionDataBackupEnabled")
    public Boolean isCrossRegionDataBackupEnabled;

    /**
     * <p>Specifies whether to enable cross-region log backup. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCrossRegionLogBackupEnabled")
    public Boolean isCrossRegionLogBackupEnabled;

    /**
     * <p>Specifies whether to enable backup. The value is fixed to 1, which indicates that backup is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsEnabled")
    public Integer isEnabled;

    /**
     * <p>The number of hours that log backups are retained locally. Valid values: 0 to 168 (7 × 24 hours). A value of 0 indicates that log backups are not retained locally. Default value: 7.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LocalLogRetention")
    public Integer localLogRetention;

    /**
     * <p>The number of binary logs retained locally. Default value: 60. Valid values: 6 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LocalLogRetentionNumber")
    public Integer localLogRetentionNumber;

    /**
     * <p>The maximum space usage for binary logs, expressed as a percentage. Valid values: 0 to 50. This parameter specifies a loop space. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LogLocalRetentionSpace")
    public Integer logLocalRetentionSpace;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of days that log backups are retained remotely. Valid values: 7 to 730. Unit: days. Default value: 7.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
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

    public UpdateBackupPolicyRequest setCrossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
        this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
        return this;
    }
    public Integer getCrossRegionDataBackupRetention() {
        return this.crossRegionDataBackupRetention;
    }

    public UpdateBackupPolicyRequest setCrossRegionFilterValue(String crossRegionFilterValue) {
        this.crossRegionFilterValue = crossRegionFilterValue;
        return this;
    }
    public String getCrossRegionFilterValue() {
        return this.crossRegionFilterValue;
    }

    public UpdateBackupPolicyRequest setCrossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
        this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
        return this;
    }
    public Integer getCrossRegionLogBackupRetention() {
        return this.crossRegionLogBackupRetention;
    }

    public UpdateBackupPolicyRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdateBackupPolicyRequest setDestCrossRegion(String destCrossRegion) {
        this.destCrossRegion = destCrossRegion;
        return this;
    }
    public String getDestCrossRegion() {
        return this.destCrossRegion;
    }

    public UpdateBackupPolicyRequest setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
        this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
        return this;
    }
    public Integer getForceCleanOnHighSpaceUsage() {
        return this.forceCleanOnHighSpaceUsage;
    }

    public UpdateBackupPolicyRequest setIsCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
        this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
        return this;
    }
    public Boolean getIsCrossRegionDataBackupEnabled() {
        return this.isCrossRegionDataBackupEnabled;
    }

    public UpdateBackupPolicyRequest setIsCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
        this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
        return this;
    }
    public Boolean getIsCrossRegionLogBackupEnabled() {
        return this.isCrossRegionLogBackupEnabled;
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
