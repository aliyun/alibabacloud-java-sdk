// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 实例名称，长度为2~256个字符。以中文、英文字母开头，可以包含数字、中文、英文、下划线（_）、短横线（-）。>不能以 http:// 和 https:// 开头。; 
    @NameInMap("DBInstanceDescription")
    @Validation(required = true)
    public String DBInstanceDescription;

    // description: 实例状态。详情请参见[实例状态表](~~26315~~)。; 
    @NameInMap("DBInstanceStatus")
    @Validation(required = true)
    public String DBInstanceStatus;

    // description: 数据库类型。; 
    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    // description: 数据库版本。; 
    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    // description: 实例所在地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 跨地域备份的目的地域ID。; 
    @NameInMap("CrossBackupRegion")
    @Validation(required = true)
    public String crossBackupRegion;

    // description: 跨地域备份保存类型。默认值：**1**，表示每个备份都保存。; 
    @NameInMap("CrossBackupType")
    @Validation(required = true)
    public String crossBackupType;

    // description: 跨地域备份开启时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z（UTC时间）。; 
    @NameInMap("BackupEnabledTime")
    @Validation(required = true)
    public String backupEnabledTime;

    // description: 跨地域备份总开关，取值：* **Disable**：关闭；* **Enable**：开启。; 
    @NameInMap("BackupEnabled")
    @Validation(required = true)
    public String backupEnabled;

    // description: 跨地域日志备份开关，取值：* **Disable**：关闭；* **Enable**：开启。; 
    @NameInMap("LogBackupEnabled")
    @Validation(required = true)
    public String logBackupEnabled;

    // description: 跨地域日志备份开启时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z（UTC时间）。; 
    @NameInMap("LogBackupEnabledTime")
    @Validation(required = true)
    public String logBackupEnabledTime;

    // description: 跨地域备份保留方式。默认值：**1**，表示按时长保留。; 
    @NameInMap("RetentType")
    @Validation(required = true)
    public Integer retentType;

    // description: 跨地域备份保留天数，取值：**7~1825**。; 
    @NameInMap("Retention")
    @Validation(required = true)
    public Integer retention;

    // description: 实例锁定状态，取值：* **Unlock**：正常，没有锁定；* **ManualLock**：手动触发锁定；* **LockByExpiration**：实例过期自动锁定；* **LockByRestoration**：实例回滚前的自动锁定；* **LockByDiskQuota**：实例空间满自动锁定，不可访问实例。; 
    @NameInMap("LockMode")
    @Validation(required = true)
    public String lockMode;

    public static DescribeInstanceCrossBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCrossBackupPolicyResponse self = new DescribeInstanceCrossBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCrossBackupPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceCrossBackupPolicyResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeInstanceCrossBackupPolicyResponse setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeInstanceCrossBackupPolicyResponse setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeInstanceCrossBackupPolicyResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeInstanceCrossBackupPolicyResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeInstanceCrossBackupPolicyResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceCrossBackupPolicyResponse setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public DescribeInstanceCrossBackupPolicyResponse setCrossBackupType(String crossBackupType) {
        this.crossBackupType = crossBackupType;
        return this;
    }
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    public DescribeInstanceCrossBackupPolicyResponse setBackupEnabledTime(String backupEnabledTime) {
        this.backupEnabledTime = backupEnabledTime;
        return this;
    }
    public String getBackupEnabledTime() {
        return this.backupEnabledTime;
    }

    public DescribeInstanceCrossBackupPolicyResponse setBackupEnabled(String backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    public DescribeInstanceCrossBackupPolicyResponse setLogBackupEnabled(String logBackupEnabled) {
        this.logBackupEnabled = logBackupEnabled;
        return this;
    }
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    public DescribeInstanceCrossBackupPolicyResponse setLogBackupEnabledTime(String logBackupEnabledTime) {
        this.logBackupEnabledTime = logBackupEnabledTime;
        return this;
    }
    public String getLogBackupEnabledTime() {
        return this.logBackupEnabledTime;
    }

    public DescribeInstanceCrossBackupPolicyResponse setRetentType(Integer retentType) {
        this.retentType = retentType;
        return this;
    }
    public Integer getRetentType() {
        return this.retentType;
    }

    public DescribeInstanceCrossBackupPolicyResponse setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public DescribeInstanceCrossBackupPolicyResponse setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

}
