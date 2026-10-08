// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The status of the cross-region backup feature. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong>: disabled.</li>
     * <li><strong>Enable</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BackupEnabled")
    public String backupEnabled;

    /**
     * <p>The time when cross-region backup was enabled. The time follows the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-12T05:44:21Z</p>
     */
    @NameInMap("BackupEnabledTime")
    public String backupEnabledTime;

    /**
     * <p>The ID of the destination region for cross-region backup.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    /**
     * <p>The storage type for cross-region backup. Default value: <strong>1</strong>, which indicates that each backup is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CrossBackupType")
    public String crossBackupType;

    /**
     * <p>The instance name. The name is 2 to 256 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter or a Chinese character.</p>
     * <blockquote>
     * <p>The name cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance states</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The lock status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Unlock</strong>: The instance is not locked.</li>
     * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
     * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
     * <li><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</li>
     * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because the storage space is exhausted. The instance is inaccessible.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The status of the cross-region log backup feature. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong>: disabled.</li>
     * <li><strong>Enable</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("LogBackupEnabled")
    public String logBackupEnabled;

    /**
     * <p>The time when cross-region log backup was enabled. The time follows the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-12T05:44:21Z</p>
     */
    @NameInMap("LogBackupEnabledTime")
    public String logBackupEnabledTime;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB7667B2-72C8-497B-9BD8-3B343CEF51AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The retention method for cross-region backup. Default value: <strong>1</strong>, which indicates that backups are retained based on the specified retention period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetentType")
    public Integer retentType;

    /**
     * <p>The number of days for which cross-region backups are retained. Valid values: <strong>7 to 1825</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    public static DescribeInstanceCrossBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCrossBackupPolicyResponseBody self = new DescribeInstanceCrossBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setBackupEnabled(String backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setBackupEnabledTime(String backupEnabledTime) {
        this.backupEnabledTime = backupEnabledTime;
        return this;
    }
    public String getBackupEnabledTime() {
        return this.backupEnabledTime;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setCrossBackupType(String crossBackupType) {
        this.crossBackupType = crossBackupType;
        return this;
    }
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setLogBackupEnabled(String logBackupEnabled) {
        this.logBackupEnabled = logBackupEnabled;
        return this;
    }
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setLogBackupEnabledTime(String logBackupEnabledTime) {
        this.logBackupEnabledTime = logBackupEnabledTime;
        return this;
    }
    public String getLogBackupEnabledTime() {
        return this.logBackupEnabledTime;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setRetentType(Integer retentType) {
        this.retentType = retentType;
        return this;
    }
    public Integer getRetentType() {
        return this.retentType;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

}
