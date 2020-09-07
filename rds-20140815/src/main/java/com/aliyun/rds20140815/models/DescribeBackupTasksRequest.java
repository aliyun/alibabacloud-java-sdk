// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("BackupJobId")
    public Integer backupJobId;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("BackupJobStatus")
    public String backupJobStatus;

    public static DescribeBackupTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksRequest self = new DescribeBackupTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBackupTasksRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public DescribeBackupTasksRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeBackupTasksRequest setBackupJobId(Integer backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public Integer getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeBackupTasksRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeBackupTasksRequest setBackupJobStatus(String backupJobStatus) {
        this.backupJobStatus = backupJobStatus;
        return this;
    }
    public String getBackupJobStatus() {
        return this.backupJobStatus;
    }

}
