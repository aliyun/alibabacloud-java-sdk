// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDetachedBackupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public String totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public String pageRecordCount;

    @NameInMap("TotalBackupSize")
    @Validation(required = true)
    public Long totalBackupSize;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDetachedBackupsResponseItems items;

    public static DescribeDetachedBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetachedBackupsResponse self = new DescribeDetachedBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDetachedBackupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDetachedBackupsResponse setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDetachedBackupsResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDetachedBackupsResponse setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDetachedBackupsResponse setTotalBackupSize(Long totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
        return this;
    }
    public Long getTotalBackupSize() {
        return this.totalBackupSize;
    }

    public DescribeDetachedBackupsResponse setItems(DescribeDetachedBackupsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDetachedBackupsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDetachedBackupsResponseItemsBackup extends TeaModel {
        @NameInMap("BackupId")
        @Validation(required = true)
        public String backupId;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("BackupStatus")
        @Validation(required = true)
        public String backupStatus;

        @NameInMap("BackupStartTime")
        @Validation(required = true)
        public String backupStartTime;

        @NameInMap("BackupEndTime")
        @Validation(required = true)
        public String backupEndTime;

        @NameInMap("BackupType")
        @Validation(required = true)
        public String backupType;

        @NameInMap("BackupMode")
        @Validation(required = true)
        public String backupMode;

        @NameInMap("BackupMethod")
        @Validation(required = true)
        public String backupMethod;

        @NameInMap("BackupDownloadURL")
        @Validation(required = true)
        public String backupDownloadURL;

        @NameInMap("BackupIntranetDownloadURL")
        @Validation(required = true)
        public String backupIntranetDownloadURL;

        @NameInMap("BackupLocation")
        @Validation(required = true)
        public String backupLocation;

        @NameInMap("BackupExtractionStatus")
        @Validation(required = true)
        public String backupExtractionStatus;

        @NameInMap("BackupScale")
        @Validation(required = true)
        public String backupScale;

        @NameInMap("BackupDBNames")
        @Validation(required = true)
        public String backupDBNames;

        @NameInMap("TotalBackupSize")
        @Validation(required = true)
        public Long totalBackupSize;

        @NameInMap("BackupSize")
        @Validation(required = true)
        public Long backupSize;

        @NameInMap("HostInstanceID")
        @Validation(required = true)
        public String hostInstanceID;

        @NameInMap("StoreStatus")
        @Validation(required = true)
        public String storeStatus;

        @NameInMap("MetaStatus")
        @Validation(required = true)
        public String metaStatus;

        @NameInMap("SlaveStatus")
        @Validation(required = true)
        public String slaveStatus;

        @NameInMap("ConsistentTime")
        @Validation(required = true)
        public Long consistentTime;

        @NameInMap("IsAvail")
        @Validation(required = true)
        public Integer isAvail;

        public static DescribeDetachedBackupsResponseItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDetachedBackupsResponseItemsBackup self = new DescribeDetachedBackupsResponseItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeDetachedBackupsResponseItemsBackup setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupLocation(String backupLocation) {
            this.backupLocation = backupLocation;
            return this;
        }
        public String getBackupLocation() {
            return this.backupLocation;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupExtractionStatus(String backupExtractionStatus) {
            this.backupExtractionStatus = backupExtractionStatus;
            return this;
        }
        public String getBackupExtractionStatus() {
            return this.backupExtractionStatus;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupScale(String backupScale) {
            this.backupScale = backupScale;
            return this;
        }
        public String getBackupScale() {
            return this.backupScale;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupDBNames(String backupDBNames) {
            this.backupDBNames = backupDBNames;
            return this;
        }
        public String getBackupDBNames() {
            return this.backupDBNames;
        }

        public DescribeDetachedBackupsResponseItemsBackup setTotalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }
        public Long getTotalBackupSize() {
            return this.totalBackupSize;
        }

        public DescribeDetachedBackupsResponseItemsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeDetachedBackupsResponseItemsBackup setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeDetachedBackupsResponseItemsBackup setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
        }

        public DescribeDetachedBackupsResponseItemsBackup setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public DescribeDetachedBackupsResponseItemsBackup setSlaveStatus(String slaveStatus) {
            this.slaveStatus = slaveStatus;
            return this;
        }
        public String getSlaveStatus() {
            return this.slaveStatus;
        }

        public DescribeDetachedBackupsResponseItemsBackup setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeDetachedBackupsResponseItemsBackup setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

    }

    public static class DescribeDetachedBackupsResponseItems extends TeaModel {
        @NameInMap("Backup")
        @Validation(required = true)
        public java.util.List<DescribeDetachedBackupsResponseItemsBackup> backup;

        public static DescribeDetachedBackupsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDetachedBackupsResponseItems self = new DescribeDetachedBackupsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDetachedBackupsResponseItems setBackup(java.util.List<DescribeDetachedBackupsResponseItemsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeDetachedBackupsResponseItemsBackup> getBackup() {
            return this.backup;
        }

    }

}
