// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponseBody extends TeaModel {
    @NameInMap("ArchiveBackupSize")
    public Long archiveBackupSize;

    @NameInMap("BackupDataSize")
    public Long backupDataSize;

    @NameInMap("BackupLogSize")
    public Long backupLogSize;

    @NameInMap("BackupOssDataSize")
    public Long backupOssDataSize;

    @NameInMap("BackupOssLogSize")
    public Long backupOssLogSize;

    @NameInMap("BackupSize")
    public Long backupSize;

    @NameInMap("ColdBackupSize")
    public Long coldBackupSize;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSize")
    public Long dataSize;

    @NameInMap("DiskUsed")
    public Long diskUsed;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("LogSize")
    public Long logSize;

    @NameInMap("PaidBackupSize")
    public Long paidBackupSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLSize")
    public Long SQLSize;

    public static DescribeResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageResponseBody self = new DescribeResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageResponseBody setArchiveBackupSize(Long archiveBackupSize) {
        this.archiveBackupSize = archiveBackupSize;
        return this;
    }
    public Long getArchiveBackupSize() {
        return this.archiveBackupSize;
    }

    public DescribeResourceUsageResponseBody setBackupDataSize(Long backupDataSize) {
        this.backupDataSize = backupDataSize;
        return this;
    }
    public Long getBackupDataSize() {
        return this.backupDataSize;
    }

    public DescribeResourceUsageResponseBody setBackupLogSize(Long backupLogSize) {
        this.backupLogSize = backupLogSize;
        return this;
    }
    public Long getBackupLogSize() {
        return this.backupLogSize;
    }

    public DescribeResourceUsageResponseBody setBackupOssDataSize(Long backupOssDataSize) {
        this.backupOssDataSize = backupOssDataSize;
        return this;
    }
    public Long getBackupOssDataSize() {
        return this.backupOssDataSize;
    }

    public DescribeResourceUsageResponseBody setBackupOssLogSize(Long backupOssLogSize) {
        this.backupOssLogSize = backupOssLogSize;
        return this;
    }
    public Long getBackupOssLogSize() {
        return this.backupOssLogSize;
    }

    public DescribeResourceUsageResponseBody setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }
    public Long getBackupSize() {
        return this.backupSize;
    }

    public DescribeResourceUsageResponseBody setColdBackupSize(Long coldBackupSize) {
        this.coldBackupSize = coldBackupSize;
        return this;
    }
    public Long getColdBackupSize() {
        return this.coldBackupSize;
    }

    public DescribeResourceUsageResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeResourceUsageResponseBody setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DescribeResourceUsageResponseBody setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }
    public Long getDiskUsed() {
        return this.diskUsed;
    }

    public DescribeResourceUsageResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeResourceUsageResponseBody setLogSize(Long logSize) {
        this.logSize = logSize;
        return this;
    }
    public Long getLogSize() {
        return this.logSize;
    }

    public DescribeResourceUsageResponseBody setPaidBackupSize(Long paidBackupSize) {
        this.paidBackupSize = paidBackupSize;
        return this;
    }
    public Long getPaidBackupSize() {
        return this.paidBackupSize;
    }

    public DescribeResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceUsageResponseBody setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

}
