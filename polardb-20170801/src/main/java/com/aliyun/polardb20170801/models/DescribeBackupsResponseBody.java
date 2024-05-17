// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    /**
     * <p>The details of backup sets.</p>
     */
    @NameInMap("Items")
    public DescribeBackupsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setItems(DescribeBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeBackupsResponseBodyItemsBackup extends TeaModel {
        /**
         * <p>The end time of the backup task. The time is displayed in UTC.</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup set.</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup method. Only **Snapshot** may be returned.</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode. Valid values:</p>
         * <br>
         * <p>*   **Automated**</p>
         * <p>*   **Manual**</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The size of the backup set. Unit: bytes.</p>
         * <br>
         * <p>> After you delete the target snapshot backups, the storage space that is consumed by the backups is released. The released storage space is smaller than the size of the backup file, because the snapshots share specific data blocks. For more information, see [FAQ about backup](https://help.aliyun.com/document_detail/164881.html).</p>
         */
        @NameInMap("BackupSetSize")
        public String backupSetSize;

        /**
         * <p>The start time of the backup task. The time is displayed in UTC. Unit: seconds.</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <br>
         * <p>*   **Success**</p>
         * <p>*   **Failed**</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The type of the backup. Only **FullBackup** may be returned.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The level of the backup set. Valid values:</p>
         * <br>
         * <p>*   **Level-1**</p>
         * <p>*   **Level-2**</p>
         */
        @NameInMap("BackupsLevel")
        public String backupsLevel;

        /**
         * <p>The snapshot checkpoint time. The value follows the Unix time format. Unit: seconds.</p>
         */
        @NameInMap("ConsistentTime")
        public String consistentTime;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The expected expiration time of the backup set.</p>
         * <p>> This parameter is supported only for instances that are enabled with sparse backup.</p>
         */
        @NameInMap("ExpectExpireTime")
        public String expectExpireTime;

        /**
         * <p>The expected expiration type of the backup set (This parameter is supported only for instances that are enabled with sparse backup).</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   NEVER</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EXPIRED</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DELAY</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ExpectExpireType")
        public String expectExpireType;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <br>
         * <p>*   **0**: The backup set is unavailable.</p>
         * <p>*   **1**: The backup set is available.</p>
         */
        @NameInMap("IsAvail")
        public String isAvail;

        public static DescribeBackupsResponseBodyItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackup self = new DescribeBackupsResponseBodyItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupSetSize(String backupSetSize) {
            this.backupSetSize = backupSetSize;
            return this;
        }
        public String getBackupSetSize() {
            return this.backupSetSize;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupsLevel(String backupsLevel) {
            this.backupsLevel = backupsLevel;
            return this;
        }
        public String getBackupsLevel() {
            return this.backupsLevel;
        }

        public DescribeBackupsResponseBodyItemsBackup setConsistentTime(String consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public String getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeBackupsResponseBodyItemsBackup setExpectExpireTime(String expectExpireTime) {
            this.expectExpireTime = expectExpireTime;
            return this;
        }
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setExpectExpireType(String expectExpireType) {
            this.expectExpireType = expectExpireType;
            return this;
        }
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

        public DescribeBackupsResponseBodyItemsBackup setIsAvail(String isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public String getIsAvail() {
            return this.isAvail;
        }

    }

    public static class DescribeBackupsResponseBodyItems extends TeaModel {
        @NameInMap("Backup")
        public java.util.List<DescribeBackupsResponseBodyItemsBackup> backup;

        public static DescribeBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItems self = new DescribeBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItems setBackup(java.util.List<DescribeBackupsResponseBodyItemsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyItemsBackup> getBackup() {
            return this.backup;
        }

    }

}
