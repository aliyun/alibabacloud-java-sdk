// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    @NameInMap("CrossBackupType")
    public String crossBackupType;

    @NameInMap("BackupEnabledTime")
    public String backupEnabledTime;

    @NameInMap("BackupEnabled")
    public String backupEnabled;

    @NameInMap("LogBackupEnabled")
    public String logBackupEnabled;

    @NameInMap("LogBackupEnabledTime")
    public String logBackupEnabledTime;

    @NameInMap("RetentType")
    public Integer retentType;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("LockMode")
    public String lockMode;

    public static DescribeInstanceCrossBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCrossBackupPolicyResponseBody self = new DescribeInstanceCrossBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
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

    public DescribeInstanceCrossBackupPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeInstanceCrossBackupPolicyResponseBody setBackupEnabledTime(String backupEnabledTime) {
        this.backupEnabledTime = backupEnabledTime;
        return this;
    }
    public String getBackupEnabledTime() {
        return this.backupEnabledTime;
    }

    public DescribeInstanceCrossBackupPolicyResponseBody setBackupEnabled(String backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
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

    public DescribeInstanceCrossBackupPolicyResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

}
