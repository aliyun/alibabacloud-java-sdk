// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The storage that is occupied by archived backup files on the instance. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ArchiveBackupSize")
    public Long archiveBackupSize;

    /**
     * <p>The storage that is occupied by data backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>94324736</p>
     */
    @NameInMap("BackupDataSize")
    public Long backupDataSize;

    /**
     * <p>The storage that is occupied by log backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>45145563</p>
     */
    @NameInMap("BackupLogSize")
    public Long backupLogSize;

    /**
     * <p>The size of data backup files that are stored in Object Storage Service (OSS) buckets. Unit: bytes. The value 0 indicates no data backup files are stored in OSS buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>8821760</p>
     */
    @NameInMap("BackupOssDataSize")
    public Long backupOssDataSize;

    /**
     * <p>The size of log backup files that are stored in OSS buckets. Unit: bytes. The value 0 indicates no log backup files are stored in OSS buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>44180999</p>
     */
    @NameInMap("BackupOssLogSize")
    public Long backupOssLogSize;

    /**
     * <p>The storage that is used to store backup files. Unit: bytes. The value -1 indicates that no backup files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>53002759</p>
     */
    @NameInMap("BackupSize")
    public Long backupSize;

    /**
     * <p>The storage that is used to store cold backup files. Unit: bytes. The value -1 indicates that no cold backup files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>2337275904</p>
     */
    @NameInMap("ColdBackupSize")
    public Long coldBackupSize;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage that is used to store data files. Unit: bytes. The value -1 indicates that no data files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>1292094741</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The total storage that is occupied by data files and log files on the instance. Unit: bytes. The value -1 indicates that no data files or log files are stored on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2337275904</p>
     */
    @NameInMap("DiskUsed")
    public Long diskUsed;

    /**
     * <p>The database engine of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The storage that is used to store log files. Unit: bytes. The value -1 indicates that no log files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>1045181163</p>
     */
    @NameInMap("LogSize")
    public Long logSize;

    /**
     * <p>The backup storage for which you must pay. The system provides a free quota on backup storage. You must pay for the backup storage that exceeds the free quota. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PaidBackupSize")
    public Long paidBackupSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F937E173-559C-4498-8D90-38D32342B9E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The storage that is occupied to execute SQL statements on the instance. Unit: bytes. The value -1 indicates that no SQL statements are executed.</p>
     * 
     * <strong>example:</strong>
     * <p>315052751</p>
     */
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
