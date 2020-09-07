// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceID")
    @Validation(required = true)
    public String DBInstanceID;

    @NameInMap("EnableBackupLog")
    @Validation(required = true)
    public String enableBackupLog;

    @NameInMap("LocalLogRetentionHours")
    @Validation(required = true)
    public Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    @Validation(required = true)
    public String localLogRetentionSpace;

    @NameInMap("HighSpaceUsageProtection")
    @Validation(required = true)
    public String highSpaceUsageProtection;

    @NameInMap("CompressType")
    @Validation(required = true)
    public String compressType;

    @NameInMap("LogBackupLocalRetentionNumber")
    @Validation(required = true)
    public Integer logBackupLocalRetentionNumber;

    public static ModifyBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponse self = new ModifyBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBackupPolicyResponse setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    public ModifyBackupPolicyResponse setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyResponse setLocalLogRetentionHours(Integer localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public ModifyBackupPolicyResponse setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public ModifyBackupPolicyResponse setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public ModifyBackupPolicyResponse setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public ModifyBackupPolicyResponse setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

}
