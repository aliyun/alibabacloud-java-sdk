// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDetachedBackupsResponseBody extends TeaModel {
    /**
     * <p>Details about the backup sets.</p>
     */
    @NameInMap("Items")
    public DescribeDetachedBackupsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>717B2382-BB14-4DCB-BBC2-32DBE0******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeDetachedBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetachedBackupsResponseBody self = new DescribeDetachedBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDetachedBackupsResponseBody setItems(DescribeDetachedBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDetachedBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDetachedBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDetachedBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDetachedBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDetachedBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDetachedBackupsResponseBodyItemsBackup extends TeaModel {
        /**
         * <p>The end time of the backup task. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T03:25:55Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup method. Only snapshot backups are supported. The value is set to <strong>Snapshot</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The size of the backup set. Unit: bytes.</p>
         * <blockquote>
         * <p>After you delete the target snapshot backups, the storage space consumed by the backups is released. The released storage space is smaller than the size of the backup file, because the snapshots share certain data blocks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7251056</p>
         */
        @NameInMap("BackupSetSize")
        public String backupSetSize;

        /**
         * <p>The start time of the backup task. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T03:25:44Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The type of the backup. Only full backups are supported. The value is set to <strong>FullBackup</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The level of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>Level-1</strong>: level-1 backup set</li>
         * <li><strong>Level-2</strong>: level-2 backup set</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Level-2</p>
         */
        @NameInMap("BackupsLevel")
        public String backupsLevel;

        /**
         * <p>The snapshot checkpoint time. The value is a Unix timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1589253947</p>
         */
        @NameInMap("ConsistentTime")
        public String consistentTime;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The data backup set is unavailable.</li>
         * <li><strong>1</strong>: The data backup set is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAvail")
        public String isAvail;

        /**
         * <p>Indicates whether the backup set can be deleted. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: The backup set can be deleted.</li>
         * <li><strong>Disabled</strong>: The backup set cannot be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("StoreStatus")
        public String storeStatus;

        public static DescribeDetachedBackupsResponseBodyItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDetachedBackupsResponseBodyItemsBackup self = new DescribeDetachedBackupsResponseBodyItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupSetSize(String backupSetSize) {
            this.backupSetSize = backupSetSize;
            return this;
        }
        public String getBackupSetSize() {
            return this.backupSetSize;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupsLevel(String backupsLevel) {
            this.backupsLevel = backupsLevel;
            return this;
        }
        public String getBackupsLevel() {
            return this.backupsLevel;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setConsistentTime(String consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public String getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setIsAvail(String isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public String getIsAvail() {
            return this.isAvail;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
        }

    }

    public static class DescribeDetachedBackupsResponseBodyItems extends TeaModel {
        @NameInMap("Backup")
        public java.util.List<DescribeDetachedBackupsResponseBodyItemsBackup> backup;

        public static DescribeDetachedBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDetachedBackupsResponseBodyItems self = new DescribeDetachedBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDetachedBackupsResponseBodyItems setBackup(java.util.List<DescribeDetachedBackupsResponseBodyItemsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeDetachedBackupsResponseBodyItemsBackup> getBackup() {
            return this.backup;
        }

    }

}
