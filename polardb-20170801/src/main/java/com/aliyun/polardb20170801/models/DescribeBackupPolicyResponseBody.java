// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    @NameInMap("DataLevel2BackupRetentionPeriod")
    public String dataLevel2BackupRetentionPeriod;

    @NameInMap("BackupFrequency")
    public String backupFrequency;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
        this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public DescribeBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
        this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
        return this;
    }
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

}
