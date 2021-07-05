// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDetachedBackupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    @NameInMap("Items")
    public DescribeDetachedBackupsResponseBodyItems items;

    public static DescribeDetachedBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetachedBackupsResponseBody self = new DescribeDetachedBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDetachedBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDetachedBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDetachedBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDetachedBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDetachedBackupsResponseBody setItems(DescribeDetachedBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDetachedBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDetachedBackupsResponseBodyItemsBackup extends TeaModel {
        @NameInMap("ConsistentTime")
        public Long consistentTime;

        @NameInMap("StoreStatus")
        public String storeStatus;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        @NameInMap("IsAvail")
        public Integer isAvail;

        @NameInMap("MetaStatus")
        public String metaStatus;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("BackupMethod")
        public String backupMethod;

        public static DescribeDetachedBackupsResponseBodyItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDetachedBackupsResponseBodyItemsBackup self = new DescribeDetachedBackupsResponseBodyItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
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

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
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

        public DescribeDetachedBackupsResponseBodyItemsBackup setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDetachedBackupsResponseBodyItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
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
