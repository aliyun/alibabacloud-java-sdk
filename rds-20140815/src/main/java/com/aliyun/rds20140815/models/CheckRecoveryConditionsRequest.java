// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupFile")
    public String backupFile;

    @NameInMap("RestoreTime")
    public String restoreTime;

    public static CheckRecoveryConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryConditionsRequest self = new CheckRecoveryConditionsRequest();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryConditionsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CheckRecoveryConditionsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CheckRecoveryConditionsRequest setBackupFile(String backupFile) {
        this.backupFile = backupFile;
        return this;
    }
    public String getBackupFile() {
        return this.backupFile;
    }

    public CheckRecoveryConditionsRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

}
