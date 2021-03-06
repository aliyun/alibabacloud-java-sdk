// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupEnabled")
    public String backupEnabled;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("LogBackupEnabled")
    public String logBackupEnabled;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetentType")
    public Integer retentType;

    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    @NameInMap("CrossBackupType")
    public String crossBackupType;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static ModifyInstanceCrossBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCrossBackupPolicyResponseBody self = new ModifyInstanceCrossBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setBackupEnabled(String backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setLogBackupEnabled(String logBackupEnabled) {
        this.logBackupEnabled = logBackupEnabled;
        return this;
    }
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRetentType(Integer retentType) {
        this.retentType = retentType;
        return this;
    }
    public Integer getRetentType() {
        return this.retentType;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setCrossBackupType(String crossBackupType) {
        this.crossBackupType = crossBackupType;
        return this;
    }
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
