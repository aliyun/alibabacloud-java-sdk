// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DiskUsed")
    @Validation(required = true)
    public Long diskUsed;

    @NameInMap("DataSize")
    @Validation(required = true)
    public Long dataSize;

    @NameInMap("LogSize")
    @Validation(required = true)
    public Long logSize;

    @NameInMap("BackupSize")
    @Validation(required = true)
    public Long backupSize;

    @NameInMap("BackupOssDataSize")
    @Validation(required = true)
    public Long backupOssDataSize;

    @NameInMap("BackupOssLogSize")
    @Validation(required = true)
    public Long backupOssLogSize;

    @NameInMap("SQLSize")
    @Validation(required = true)
    public Long SQLSize;

    @NameInMap("ColdBackupSize")
    @Validation(required = true)
    public Long coldBackupSize;

    @NameInMap("BackupDataSize")
    @Validation(required = true)
    public Long backupDataSize;

    @NameInMap("BackupLogSize")
    @Validation(required = true)
    public Long backupLogSize;

    @NameInMap("PaidBackupSize")
    @Validation(required = true)
    public Long paidBackupSize;

    @NameInMap("ArchiveBackupSize")
    @Validation(required = true)
    public Long archiveBackupSize;

    public static DescribeResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageResponse self = new DescribeResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceUsageResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeResourceUsageResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeResourceUsageResponse setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }
    public Long getDiskUsed() {
        return this.diskUsed;
    }

    public DescribeResourceUsageResponse setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DescribeResourceUsageResponse setLogSize(Long logSize) {
        this.logSize = logSize;
        return this;
    }
    public Long getLogSize() {
        return this.logSize;
    }

    public DescribeResourceUsageResponse setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }
    public Long getBackupSize() {
        return this.backupSize;
    }

    public DescribeResourceUsageResponse setBackupOssDataSize(Long backupOssDataSize) {
        this.backupOssDataSize = backupOssDataSize;
        return this;
    }
    public Long getBackupOssDataSize() {
        return this.backupOssDataSize;
    }

    public DescribeResourceUsageResponse setBackupOssLogSize(Long backupOssLogSize) {
        this.backupOssLogSize = backupOssLogSize;
        return this;
    }
    public Long getBackupOssLogSize() {
        return this.backupOssLogSize;
    }

    public DescribeResourceUsageResponse setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public DescribeResourceUsageResponse setColdBackupSize(Long coldBackupSize) {
        this.coldBackupSize = coldBackupSize;
        return this;
    }
    public Long getColdBackupSize() {
        return this.coldBackupSize;
    }

    public DescribeResourceUsageResponse setBackupDataSize(Long backupDataSize) {
        this.backupDataSize = backupDataSize;
        return this;
    }
    public Long getBackupDataSize() {
        return this.backupDataSize;
    }

    public DescribeResourceUsageResponse setBackupLogSize(Long backupLogSize) {
        this.backupLogSize = backupLogSize;
        return this;
    }
    public Long getBackupLogSize() {
        return this.backupLogSize;
    }

    public DescribeResourceUsageResponse setPaidBackupSize(Long paidBackupSize) {
        this.paidBackupSize = paidBackupSize;
        return this;
    }
    public Long getPaidBackupSize() {
        return this.paidBackupSize;
    }

    public DescribeResourceUsageResponse setArchiveBackupSize(Long archiveBackupSize) {
        this.archiveBackupSize = archiveBackupSize;
        return this;
    }
    public Long getArchiveBackupSize() {
        return this.archiveBackupSize;
    }

}
