// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The status of the cross-region backup feature on the instance. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong></li>
     * <li><strong>Enable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BackupEnabled")
    public String backupEnabled;

    /**
     * <p>The point in time at which the cross-region backup feature is enabled. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-12T05:44:21Z</p>
     */
    @NameInMap("BackupEnabledTime")
    public String backupEnabledTime;

    /**
     * <p>The ID of the destination region where the cross-region backup files of the instance are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    /**
     * <p>The policy that is used to save the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that all cross-region backup files are saved.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CrossBackupType")
    public String crossBackupType;

    /**
     * <p>The name of the instance. It must be 2 to 256 characters in length. The value can contain letters, digits, underscores (_), and hyphens (-), and must start with a letter.</p>
     * <blockquote>
     * <p> The value cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test database</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance state table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The database engine of the instance.</p>
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
     * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The status of the cross-region log backup feature on the instance. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong></li>
     * <li><strong>Enable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("LogBackupEnabled")
    public String logBackupEnabled;

    /**
     * <p>The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
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
     * <p>The policy that is used to retain the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that the cross-region backup files of the instance are retained based on the specified retention period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetentType")
    public Integer retentType;

    /**
     * <p>The number of days for which the cross-region backup files of the instance are retained. Valid values: <strong>7 to 1825</strong>.</p>
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
