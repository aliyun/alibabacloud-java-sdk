// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDetachedBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDetachedBackupsResponseBodyItems items;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupSetSize")
        public String backupSetSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupsLevel")
        public String backupsLevel;

        @NameInMap("ConsistentTime")
        public String consistentTime;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("IsAvail")
        public String isAvail;

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
